package util;
import java.util.Scanner;
public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public static String getString(){
        System.out.println("Enter string: ");
        return scanner.nextLine();
    }

    public static String getString(String prompt) {
        System.out.printf("Your prompt is %s\n", prompt);
        return prompt;
    }

    public static boolean yesNo(){
        String check;
        System.out.println("Enter yes (or y) for yes:");
        check = scanner.next();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

    public static boolean yesNo(String prompt) {
        System.out.printf("Your prompt is %s\n", prompt);
        return prompt.equalsIgnoreCase("yes") || prompt.equalsIgnoreCase(("y"));
    }

    public static int getInt(int min, int max) {
        String check;
        System.out.printf("Enter integer value between %s and %s:\n", min, max);
        check = scanner.next();
        int number;
        try {
            number = Integer.parseInt(check);
            if (number < min || number > max) {
                System.out.println("That number is not in range.");
                number = getInt(min, max);
                return number;
            }
            else {
                return number;
            }
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input. try again: ");
            return getInt(min, max);
        }
    }

    public static int getInt(int min, int max, String prompt) {
        System.out.printf("Your prompt is %s\n", prompt);
        int check = Integer.parseInt(prompt);
        if (check < min || check > max) {
            System.out.println("That number is not in range. Enter new prompt:");
            prompt = scanner.next();
            check = getInt(min, max, prompt);
            return check;
        }
        else {
            return check;
        }

    }

    public static int getInt() {
//        System.out.println("Enter integer value: ");
//        return scanner.nextInt();
        String check;
        System.out.println("Enter integer value: ");
        check = scanner.next();
        int number;
        try {
            number = Integer.parseInt(check);
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getInt();
        }
    }

    public static int getInt(String prompt){
        System.out.printf("Your prompt is %s\n", prompt);
        return Integer.parseInt(prompt);
    }

    public static double getDouble(double min, double max){
        String check;
        System.out.printf("Enter integer value between %s and %s:\n", min, max);
        check = scanner.next();
        double number;
        try {
            number = Double.parseDouble(check);
            if (number < min || number > max) {
                System.out.println("That number is not in range.");
                number = getDouble(min, max);
                return number;
            }
            else {
                return number;
            }
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input. try again: ");
            return getDouble(min, max);
        }
    }

    public static double getDouble(double min, double max, String prompt) {
        System.out.printf("Your prompt is %s\n", prompt);
        double check = Double.parseDouble(prompt);
        if (check < min || check >  max) {
            System.out.println("That number is not in range. Enter new prompt:");
            prompt = scanner.next();
            check = getDouble(min, max, prompt);
            return check;
        }
        else {
            return check;
        }
    }

    public static double getDouble() {
//        System.out.println("Enter double value: ");
//        return scanner.nextDouble();
        String check;
        System.out.println("Enter double value: ");
        check = scanner.next();
        double number;
        try {
            number = Double.parseDouble(check);
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getDouble();
        }
    }

    public static double getDouble(String prompt) {
        System.out.printf("Your prompt is %s\n", prompt);
        return Double.parseDouble(prompt);
    }
}
