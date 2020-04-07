public class Main {

    public static void main(String[] args) {
        MathLibrary math1 = MathLibrary.getInstance();
        MathLibrary math2 = MathLibrary.getInstance();

        System.out.println(math1.toString());
        System.out.println(math1.hashCode());

        System.out.println(math2.toString());
        System.out.println(math2.hashCode());
    }
}
