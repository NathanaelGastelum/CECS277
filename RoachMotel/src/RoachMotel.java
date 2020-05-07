/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel
    Outputs: Notifies when Roach Colonies check in and out*/

import java.util.ArrayList;
import java.util.List;

public class RoachMotel {
    private static RoachMotel instance;
    private RoomFactory roomFactory;
    private ArrayList<Integer> availableRooms;
    private ArrayList<MotelRoom> rooms;

    // Private constructor prevents object creation via new
    private RoachMotel() {
        roomFactory = new RoomFactory();
    }

    // Singleton pattern implementation
    public synchronized static RoachMotel getInstance() {
        if (instance == null) {
            instance = new RoachMotel();
        }
        return instance;
    }

    // Creates room numbers in motel
    public void createRooms() {
        availableRooms = new ArrayList<>(List.of(101, 102, 103, 104, 105));
        rooms = new ArrayList<>();
    }

    // Check roach colony into hotel: assign roomType and amenities
    public MotelRoom checkIn(RoachColony rc, String roomType, ArrayList<String> amenities) {

        MotelRoom room = roomFactory.makeRoom(roomType);

        // Check room availability
        if (!availableRooms.isEmpty()) {

            // Amenity decorator
            for (String s : amenities) {
                if (s.equals("foodbar")) room = new FoodBar(room);
                if (s.equals("spa")) room = new Spa(room);
                if (s.equals("refillbar")) room = new RefillBar(room);
                if (s.equals("shower")){
                    room = new Shower(room);
                    rc.takeShower();
                }
            }
            room.rc = rc;

            // Adjust room availability
            room.setNumber(availableRooms.get(0));
            System.out.println("Checking into room " + room.getNumber());
            availableRooms.remove(0);
            rooms.add(room);

        }
        else {
            System.out.println("No Vacancy");
            room.description = "Unavailable";
        }
        return room;
    }

    // Check out: assign room to available and handle payment
    public double checkOut(MotelRoom room, int nights, PayMethod payMethod) {

        System.out.println("Checking out of room " + room.getNumber());
        // Adjust room availability
        availableRooms.add(room.getNumber());
        rooms.remove(room);

        // Handle payment
        double totalCost = room.cost() * nights;
        payMethod.pay(totalCost);

        return totalCost;
    }

    // Return occupied room data and available rooms
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Motel: {");
        for (MotelRoom room : rooms) {
            s.append(" [" + room + " $" + room.cost() + " " + room.rc + "] ");
        }
        s.append("} Available: " + availableRooms);

        return s.toString();
    }
}
