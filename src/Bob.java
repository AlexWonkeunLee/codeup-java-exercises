import java.util.Scanner;


public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's up?");
        String sentence = scanner.nextLine();
        if (sentence.endsWith("?")){
            System.out.println("Sure.");
        }
        else if (sentence.endsWith("!")){
            System.out.println("Woah, chill out!");
        }
        else if (sentence.equals("")){
            System.out.println("Fine. Be that way!");
        }
        else {
            System.out.println("Whatever.");
        }
    }

}
