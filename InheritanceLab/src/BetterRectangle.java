import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public int getPerimeter() {
        int perimeter = height * 2 + width * 2;
        return perimeter;
    }

    public int getArea() {
        int area = this.height * this.width;
        return area;
    }
}
