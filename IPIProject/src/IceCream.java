public class IceCream extends DessertItem {

    private int calories;
    private double price;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public double getCost() {
        return price;
    }
}
