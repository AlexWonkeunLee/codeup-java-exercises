package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double newLength, double newWidth){
        length = newLength;
        width = newWidth;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public double getArea(){
        return length * width;
    }
}
