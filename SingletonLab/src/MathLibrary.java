public class MathLibrary {
    private static MathLibrary instance;

   // declare the constructor as private which prevents object creation via new
    private MathLibrary() { }

    public int someMathMethod() {
        return -1;
    }

    public double anotherMathMethod() {
        return 0;
    }
    public synchronized static MathLibrary getInstance() {
        if (instance == null) {
            instance = new MathLibrary();
        }
        return instance;
    }
}