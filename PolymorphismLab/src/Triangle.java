import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle () {
        super();
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle (String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        double area = sqrt(p*(p - side1)*(p - side2)*(p - side3));
        return area;
    }
}
