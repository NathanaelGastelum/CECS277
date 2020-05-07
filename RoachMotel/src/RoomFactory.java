/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public class RoomFactory {

    // Factory pattern implementation
    public MotelRoom makeRoom(String roomType) {
        if (roomType.equals("Regular"))
            return new regularRoom();
        if (roomType.equals("Deluxe"))
            return new deluxeRoom();
        if (roomType.equals("Suite"))
            return new suiteRoom();
        else
            return null;
    }
}
