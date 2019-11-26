package shapes;

class Circle{
    private static double radius;
    private static int counter;
    public Circle(double radius) {
        Circle.radius = radius;
    }

    public static void circleCount() {
        counter++;
    }

    public static void displayCount() {
        System.out.printf("Total circles is: %d", counter);
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
