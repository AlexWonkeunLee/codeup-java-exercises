package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("This is Circle Creator\n");
        do {
            System.out.println("Enter radius of circle.");
            Circle circle = new Circle(Input.getDouble());
            System.out.println("Circle stats:");
            System.out.printf("Circumference: %.2f\n", circle.getCircumference());
            System.out.printf("Area: %.2f\n", circle.getArea());
            Circle.circleCount();
            System.out.println("Would you like to create another circle?");
        } while (Input.yesNo());
        Circle.displayCount();
    }
}
