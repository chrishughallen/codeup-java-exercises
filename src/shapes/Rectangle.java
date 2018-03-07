package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2) ;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
