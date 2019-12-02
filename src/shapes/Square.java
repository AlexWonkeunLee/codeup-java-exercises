package shapes;

public class Square extends Rectangle{
    private double each;

    public Square(double side){
        super(side, side);
        length = side;
        width = side;
        each = side;
    }

    public double getPerimeter() {
        System.out.println("overide...");
        return 4 * each;
    }

    public double getArea() {
        System.out.println("overide...");
        return Math.pow(each, 2);
    }
}
