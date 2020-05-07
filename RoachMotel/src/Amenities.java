/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public abstract class Amenities extends MotelRoom {

    public abstract double cost();
    public abstract String toString();
}

