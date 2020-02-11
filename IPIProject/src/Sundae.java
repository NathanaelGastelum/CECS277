public class Sundae extends IceCream {

    private int calories;
    private double icecreamPrice;
    private double toppingPrice;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public double getCost() {
        double cost = icecreamPrice + toppingPrice;
        return cost;
    }
}
