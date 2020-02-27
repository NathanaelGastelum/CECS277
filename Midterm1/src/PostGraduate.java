public class PostGraduate extends Graduate {

    public PostGraduate(String firstName, String major, int units) {
        super(firstName, major, units);
    }

    @Override
    public int calculateTuition(int units) {
        return units * 750;
    }
}