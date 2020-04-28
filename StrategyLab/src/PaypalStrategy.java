public class PaypalStrategy implements PaymentStrategy {

    String emailId;
    String password;

    PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println("Made payment of $" + amount + " with PayPal");
    }
}
