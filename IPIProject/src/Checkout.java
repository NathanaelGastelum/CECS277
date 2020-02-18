import java.util.ArrayList;

import static java.lang.Math.round;

public class Checkout {
    private ArrayList<DessertItem> cart;
    private double taxRate;

    public Checkout(){
        cart = new ArrayList<>();
        taxRate = .1025;
    }

    public void addToCart(DessertItem item) {
        cart.add(item);
    }

    public void clearCart() {
        cart.clear();
    }

    public int getSize(){
        return cart.size();
    }

    public double subTotal() {
        double subTotal = 0;

        for (DessertItem i : cart) {
            subTotal = subTotal + i.getCost();
        }
        return subTotal/100;
    }

    public double tax() {
        return round(taxRate * subTotal() * 100.00)/100.00;
    }

    public double total() {
        return subTotal() + tax();
    }

    @Override
    public String toString() {
        String receipt = "";

        for (DessertItem i : cart) {
            receipt = receipt.concat(i.name +"    "+ i.getCost() + "\n");
        }

        receipt = receipt.concat(subTotal() + "\n");
        receipt = receipt.concat(tax() + "\n");
        receipt = receipt.concat(total() + "\n");

        return receipt;
    }
}
