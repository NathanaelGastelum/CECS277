/*  Nathanael Gastelum
    April 22, 2020
    Purpose: The Trade class is used to make new trade objects by the Stock class*/

public class Trade {
    private Trader trader;
    private String transactionType;
    private Double price;
    private Stock stock;

    // Constructor for Trade objects that requires necessary info as arguments
    public Trade (Trader trader,String transactionType, double price, Object stock) {
        this.trader = trader;
        this.transactionType = transactionType;
        this.price = price;
        this.stock = (Stock) stock;
    }

    public String toString() {
        return "Trader: " + trader + " " + transactionType + " " + "$" + price + " Stock: " + stock.toString();
    }
}