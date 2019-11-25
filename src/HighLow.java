import java.util.Scanner;
public class HighLow {
    public static void main(String[] args){
        String choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to HighLow! Try to guess the number between 1-100");
        System.out.println("If you don't get it within 10 guesses, you lose!");
        do {
            int limit = 10;
            int guesses = 0;
            int winner = (int) getRandom(1, 100);
            System.out.println("New number chosen! Lets guess the number!");
            while (guesses < limit) {
                System.out.println("Guesses left: " + (limit - guesses));
                int guess = getNumber(1, 100);
                if (guess > winner) {
                    System.out.println("LOWER");
                } else if (guess < winner) {
                    System.out.println("HIGHER");
                } else {
                    System.out.println("GOOD GUESS!");
                    break;
                }
                guesses++;
            }
            if (guesses == limit) {
                System.out.println("Ran out of guesses :(");
                System.out.println("GAME OVER");
            }
            System.out.println("Press 'y' to play again.");
            choice = scanner.nextLine();
        } while(choice.equals("y"));
    }
    public static int getNumber(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int num = scanner.nextInt();
        if (num >= min && num <= max){
            return num;
        }
        else {
            System.out.println("That is not between " + min + " and " + max);
            num = getNumber(min,max);
        }
        return num;
    }
    public static double getRandom(int min, int max){
        return (Math.random() * ((max - min) + 1) + min);
    }
}
