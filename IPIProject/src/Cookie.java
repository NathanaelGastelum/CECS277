public class Cookie extends DessertItem {

    private int calories;
    private double number;
    private double price;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setWeight(double number) {
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getCost() {
        long cost = Math.round((number/12) * price);
        return cost;
    }
}
