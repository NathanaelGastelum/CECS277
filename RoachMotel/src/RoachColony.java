/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel
    Outputs: Tests for each aspect of the Roach Motel*/

public class RoachColony {

    private String name;
    private long pop;
    private double growthRate;
    private boolean resistant = false;

    // Colony constructor
    public RoachColony(String name, long pop, double growthRate) {
        this.name = name;
        this.pop = pop;
        this.growthRate = growthRate;
    }

    // Spray insecticide based on room amenities
    public void party() {
        pop = Math.round(pop * (1 + growthRate));
        if (resistant) {
            pop = Math.round(pop * .75);
        }
        else {
            pop = Math.round(pop * .50);
        }
    }

    // Makes roaches resistant to spray
    public void takeShower() {
        resistant = true;
    }

    public String getName() {
        return name;
    }

    // Returns name and population
    public String toString() {
        return name + " " + pop;
    }
}
