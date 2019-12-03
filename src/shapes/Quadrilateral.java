package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double setLength, double setWidth){
        length = setLength;
        width = setWidth;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    void setWidth(double input){
        width = input;
    }

    void setLength(double input){
        length = input;
    }
}
