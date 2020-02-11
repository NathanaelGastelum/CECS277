public class Candy extends DessertItem {

    private int calories;
    private double weight;
    private double price;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getCost() {
        long cost = Math.round(weight * price);
        return cost;
    }
}
