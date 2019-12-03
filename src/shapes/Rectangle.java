package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double setLength, double setWidth) {
        super(setLength, setWidth);
        length = setLength;
        width = setWidth;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
}
