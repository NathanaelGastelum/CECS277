public class Graduate extends Student {

    public Graduate(String firstName, String major, int units) {
        super(firstName, major, units);
    }

    @Override
    public int calculateTuition(int units) {
        return units * 500;
    }
}
