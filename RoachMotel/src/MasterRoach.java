/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel
    Outputs: Payment amount and method*/

public class MasterRoach implements PayMethod {

    String name;
    String cardNumber;
    String cvv;
    String dateOfExpiry;

    public MasterRoach(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.name = cardNumber;
        this.name = cvv;
        this.name = dateOfExpiry;
    }

    public void pay(double amount) {
        System.out.println("$" + amount + " paid with MasterRoach");
    }
}
