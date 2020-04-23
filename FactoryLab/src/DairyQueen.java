public class DairyQueen extends IceCreamShop {

    public IceCream getIceCream(String type) {
        if (type.equals("Chocolate"))
            return new Chocolate();
        else if (type.equals("Vanilla"))
            return new Vanilla();
        else if (type.equals("Strawberry"))
            return new Strawberry();
        else
            return null;
    }
}
