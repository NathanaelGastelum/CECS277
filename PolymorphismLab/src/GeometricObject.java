public class GeometricObject {

    private java.util.Date dateCreated;
    private String name = "noname";

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified name */
    public GeometricObject(String name) {
        dateCreated = new java.util.Date();
        this.name = name;
    }



    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return name */
    public String getName() {
        return name;
    }

    /** Set a new name */
    public void setName(String name) {
        this.name = name;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated +  " and named: " + name;
    }

    /** Dummy methods for getArea() and getPerimeter() so this can be used
     as a class that supports polymorphism */
    public double getArea() {
        return 0.0;
    }
    public double getPerimeter() {
        return 0.0;
    }
}