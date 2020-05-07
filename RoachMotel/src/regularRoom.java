/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public class regularRoom extends MotelRoom {

    public static final double cost = 50.00;

    public regularRoom() { description = "Regular"; }

    public double cost() {
        return cost;
    }
}
