/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public class deluxeRoom extends MotelRoom {

    public static final double cost = 75.00;

    public deluxeRoom() { description = "Deluxe"; }

    public double cost() {
        return cost;
    }
}
