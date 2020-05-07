/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public class suiteRoom extends MotelRoom {

    public static final double cost = 100.00;

    public suiteRoom() { description = "Suite"; }

    public double cost() {
        return cost;
    }
}
