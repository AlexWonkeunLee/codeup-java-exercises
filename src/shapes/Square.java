package shapes;

abstract class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
        length = side;
        width = side;
    }

    public double getArea(){

    }
}
