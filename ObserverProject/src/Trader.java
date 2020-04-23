/*  Nathanael Gastelum
    April 22, 2020
    Purpose: The Trader class uses the Observer interface to display updates
    from the Stock class
    Outputs: Displays new trades when update method is called by stocks they are tracking*/

public class Trader implements Observer {
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    // Called when a new trade has been made
    @Override
    public void update(Object newState) {
        Trade latestTrade = (Trade)newState;
        display(latestTrade);
    }

    public void display(Trade latestTrade) {
        System.out.println("The latest trade is " + latestTrade.toString());
    }

    public String toString() {
        return name;
    }
}