/*  Nathanael Gastelum
    May 7, 2020
    Purpose: This program uses Singleton, Factory, Decorator, and Strategy Design Patterns
    to simulate the world's most disgusting motel
    Outputs: Payment amount and method*/

public class RoachPal implements PayMethod {

    String name;
    String email;

    public RoachPal(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("$" + amount + " paid with RoachPal");
    }
}
