public class LetsEat {

    public static void main(String[] args) {
        IceCreamShop bAndJ = new BenAndJerry();
        IceCream cone;
        cone = bAndJ.orderCone("Cherry Garcia");
        System.out.println("Enjoying some " + cone.getDescription() + " which costs " + cone.cost());

        IceCreamShop dQ = new DairyQueen();
        IceCream cone2 = dQ.orderCone("Strawberry");
        System.out.println("Enjoying some " + cone2.getDescription() + " which costs " + cone2.cost());
    }
}
