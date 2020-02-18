import java.util.ArrayList;

import static java.lang.Math.round;

public class Checkout {
    private ArrayList<DessertItem> cart;
    private double taxRate;

    public Checkout(){
        cart = new ArrayList<>();
        taxRate = .1025;
    }

    public void clear() {
        cart.clear();
    }

    public void enterItem(DessertItem item) {
        cart.add(item);
    }

    public int numberOfItems(){
        return cart.size();
    }

    @Override
    public String toString() {
        String receipt = "";

        for (DessertItem i : cart) {
            receipt = receipt.concat(i.name +"         "+ i.getCost() + "\n");
        }

        receipt += "SubTotal: " + totalCost()/100.00 + "\n";
        receipt += "Tax: " + totalTax()/100.00 + "\n";
        receipt += "Total: " + ((totalCost() + totalTax())/100.00) + "\n";

        return receipt;
    }

    public int totalCost() {
        double subTotal = 0;

        for (DessertItem i : cart) {
            subTotal += i.getCost();
        }
        return (int)subTotal;
    }

    public long totalTax() {
        return round(taxRate * totalCost());
    }
}
