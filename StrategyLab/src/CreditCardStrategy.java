public class CreditCardStrategy implements PaymentStrategy {

    String name;
    String CardNumber;
    String cvv;
    String dateOfExpiry;

    CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.name = cardNumber;
        this.name = cvv;
        this.name = dateOfExpiry;
    }

    public void pay(int amount) {
        System.out.println("Made payment of $" + amount + " with credit card");
    }
}
