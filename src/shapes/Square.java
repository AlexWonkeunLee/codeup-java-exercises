package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
        length = side;
        width = side;
    }

    public double getArea(){
        return Math.pow(length, 2);
    }

    public double getPerimeter(){
        return length * 4;
    }

}
