/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel*/

public abstract class MotelRoom {
    protected String description;
    protected int roomNumber;
    public RoachColony rc;

    public abstract double cost();

    public void setNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumber() {
        return roomNumber;
    }

    public String toString() {
        return description;
    }
}