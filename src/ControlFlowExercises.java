import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        for (int i = 5; i <= 15; i++){
            System.out.print(i + " ");
        }

//        int j = 0;
//        do{
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
        System.out.println("");
        for (int j = 0; j <= 100; j += 2){
            System.out.println(j);
        }
        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);
        long l = 2;
        do {
            System.out.println(l);
            l = l * l;
        } while (l < 1000000);

        for (int m = 1; m < 100; m++){
            if (m % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (m % 5 == 0){
                System.out.println("Buzz");
            }
            else if (m % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(m);
            }
        }
        Scanner scanner = new Scanner(System.in);
        String choice1;
        String choice2;
        do {
            System.out.println("\nEnter integer to go to: ");
            int number = scanner.nextInt();
            System.out.println("Table: ");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int n = 0; n < number; n++) {
                System.out.println(n + "      | " + (n * n) + "       | " + (n * n * n));
            }
            System.out.println("\nEnter y for new table: ");
            choice1 = scanner.next();
        } while(choice1.equals("y"));

        do {
            System.out.println("\nEnter grade: ");
            int grade = scanner.nextInt();
            if (grade <= 100 && grade >= 97) {
                System.out.println("Grade is A+");
            }
            else if (grade <= 96 && grade >= 93) {
                System.out.println("Grade is A");
            }
            else if (grade <= 92 && grade >= 90) {
                System.out.println("Grade is A-");
            }
            else if (grade <= 89 && grade >= 87) {
                System.out.println("Grade is B+");
            }
            else if (grade <= 86 && grade >= 83) {
                System.out.println("Grade is B");
            }
            else if (grade <= 82 && grade >= 80) {
                System.out.println("Grade is B-");
            }
            else if (grade <= 79 && grade >= 77) {
                System.out.println("Grade is C+");
            }
            else if (grade <= 76 && grade >= 73) {
                System.out.println("Grade is C");
            }
            else if (grade <= 72 && grade >= 70) {
                System.out.println("Grade is C-");
            }
            else if (grade <= 69 && grade >= 67) {
                System.out.println("Grade is D+");
            }
            else if (grade <= 66 && grade >= 63) {
                System.out.println("Grade is D");
            }
            else if (grade <= 62 && grade >= 60) {
                System.out.println("Grade is D-");
            }
            else{
                System.out.println("FAILED");
            }
            System.out.println("\nEnter y for new grade: ");
            choice2 = scanner.next();
        } while(choice2.equals("y"));

    }
}
