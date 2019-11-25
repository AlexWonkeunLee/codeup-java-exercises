public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(4,2));
        System.out.println(subtract(4, 2));
        System.out.println(multiply(4, 5));
        System.out.println(divide(4, 2));
        System.out.println(modulus(4,2));
        System.out.println(divide(4,0));
    }
    private static int add(int x, int y){
        return x + y;
    }
    private static int subtract(int x, int y){
        return x - y;
    }
    private static int multiply(int x, int y) {
//        return x * y;
//        float number = x;
//        for (int i = 1; i < y; i++){
//            x = number + x;
//        }
        if (x == 0 || y == 0){
            return 0;
        }
        return x + multiply(x,y - 1);
    }
    private static float divide(float x, float y) {
        return x / y;
    }
    private static float modulus(float x, float y) {
        return x % y;
    }

}
