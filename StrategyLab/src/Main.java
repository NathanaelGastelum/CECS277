public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PaymentStrategy cc = new CreditCardStrategy("Bob", "123456789", "123", "4/21");
        PaymentStrategy payPal = new PaypalStrategy("bob@gmail.com", "password");

        cart.addItem(new Item("TP", 500));
        cart.addItem(new Item("Hand Sanitizer", 100));
        cart.addItem(new Item("Coffee", 20));

        cart.pay(cc);
        cart.pay(payPal);
    }
}
