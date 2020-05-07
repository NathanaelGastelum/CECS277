/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public class Shower extends Amenities{

    protected MotelRoom room;
    public static final double cost = 25.00;

    public Shower(MotelRoom room) {
        this.room = room;
    }

    public double cost() {
        return room.cost() + cost;
    }

    public String toString() {
        return room + ", Shower";
    }
}