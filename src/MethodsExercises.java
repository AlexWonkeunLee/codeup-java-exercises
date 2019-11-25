import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(add(4,2));
        System.out.println(subtract(4, 2));
        System.out.println(multiply(4, 5));
        System.out.println(divide(4, 2));
        System.out.println(modulus(4,2));
        System.out.println(divide(4,0));
        String choice1;
        String choice2;
        do {
            System.out.println("FACTORIAL:");
            int userInput = getInteger(1, 25);
            System.out.println("Number is: " + userInput);
            long factorial = 1;
            System.out.print(userInput + "! = " + factorial);
            for (int i = 2; i <= userInput; i++){
                System.out.print(" x " + i);
                factorial = factorial * i;
            }
            System.out.println("  = " + factorial);
            System.out.println("Enter 'y' for another factorial");
            choice1 = scanner.nextLine();
        } while(choice1.equals("y"));

        do {
            System.out.println("DICE ROLL:");
            System.out.println("Number of sides:");
            int diceSides = scanner.nextInt();
            System.out.println("Press enter to roll dice.");
            scanner.nextLine();
            String roll = scanner.nextLine();
            if (roll.equals("")){
                System.out.println("Rolling...");
                int dice1 = (int)getRandom(1, diceSides);
                int dice2 = (int)getRandom(1, diceSides);
                System.out.println("Your dices show " + dice1 + " and " + dice2);
            }
            else {
                System.out.println("Just press enter next time.");
            }
            System.out.println("Enter 'y' to do again");
            choice2 = scanner.nextLine();
        } while(choice2.equals("y"));

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
    private static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int num = scanner.nextInt();
        if (num >= min && num <= max){
            return num;
        }
        else {
            System.out.println("That is not between " + min + " and " + max);
            num = getInteger(min,max);
        }
        return num;
    }
    private static double getRandom(int min, int max){
        return (Math.random() * ((max - min) + 1) + min);
    }
}
