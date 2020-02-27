public class UnderGrad extends Student {

    public UnderGrad(String firstName, String major, int units) {
        super(firstName, major, units);
    }

    @Override
    public int calculateTuition(int units) {
        return units * 250;
    }
}
