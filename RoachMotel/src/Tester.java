/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel
    Outputs: Tests for each aspect of the Roach Motel*/

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {

        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);
        RoachColony rc1 = new  RoachColony("first colony",100,1);
        ArrayList<String> amenities = new ArrayList<>();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
        MotelRoom r1 = rm.checkIn(rc1,"Suite",amenities);
        System.out.println(rc1);
        System.out.println(rm);
        System.out.println();

        // Shower test
        System.out.println("Shower test : ");
        rc1.party();
        System.out.println(rm);
        System.out.println();

        RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
        ArrayList<String> amenities2 = new ArrayList<>();
        amenities2.add("foodbar");
        MotelRoom r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        System.out.println();

        // Party test
        System.out.println("Party, no shower: ");
        rc2.party();
        System.out.println(rc2);

        //Payment test
        PayMethod roachPal = new RoachPal(rc2.getName(), "creepycrawly@gmail.com");
        Double cost = rm.checkOut(r2,3, roachPal);
        System.out.println("cost:" + cost);
        System.out.println(rm);
        System.out.println();

        PayMethod masterRoach = new MasterRoach(rc1.getName(), "123456789", "123", "5/7/2020");
        cost = rm.checkOut(r1,3, masterRoach);
        System.out.println("cost:" + cost);
        System.out.println(rm);
        System.out.println();

        // No Vacancy test
        RoachColony rc3 = new RoachColony("third colony",300,0.3);
        MotelRoom r3 = rm.checkIn(rc3,"Regular",amenities2);
        RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
        MotelRoom r4 = rm.checkIn(rc4,"Regular",amenities2);
        RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
        MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities2);
        RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
        MotelRoom r9 = rm.checkIn(rc6,"Regular",amenities2);
        RoachColony rc10 = new RoachColony("third colony",300,0.3);
        MotelRoom r10 = rm.checkIn(rc10,"Regular",amenities2);
        RoachColony rc11 = new RoachColony("third colony",300,0.3);
        MotelRoom r11 = rm.checkIn(rc11,"Regular",amenities2);
    }
}