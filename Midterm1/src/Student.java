public abstract class Student {
    private String firstName;
    private String major;
    private int units;

    public Student(String firstName, String major, int units) {
        this.firstName = firstName;
        this.major = major;
        this.units = units;
    }

    abstract public int calculateTuition(int units);

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
