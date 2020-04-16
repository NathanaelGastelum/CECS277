// Tester for kilometers adapter
public class Tester {
    public static void main(String args[]) {
        MilesClient mc = new MilesClient();
        double distance =  mc.distance(60, 3);

        System.out.println("Traveled " + distance + " miles");
    }
}
