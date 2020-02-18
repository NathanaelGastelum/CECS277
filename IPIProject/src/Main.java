public class Main {

    public static void main(String[] args) {
        Cookie test = new Cookie();
        Checkout cart = new Checkout();

        cart.enterItem(test);
        System.out.println(cart.toString());
    }
}