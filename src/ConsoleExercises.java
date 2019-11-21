import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("%.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.format("Your number is %s.\n", number);
        System.out.println("Enter 3 words: ");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.format("Your words are %s %s, and %s.\n", first, second, third);
        System.out.println("Enter a whole sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println(sentence);
        System.out.println("Enter the length, width, and height of the classroom:");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float height =  scanner.nextFloat();
        float area = length * width;
        float volume = length * width * height;
        System.out.format("The area is %.2f.\n", area);
        System.out.format("The volume is %.2f,", volume);
    }
}
