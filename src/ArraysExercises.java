import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[3];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter name: ");
            people[i] = new Person(scanner.next());
        }
        for (Person ppl : people){
            System.out.println(ppl.getName());
        }
        System.out.println("One more name: ");
        Person extra = new Person(scanner.next());
        people = addPerson(people, extra);
        for (Person ppl : people){
            System.out.println(ppl.getName());
        }
    }

    public static Person[] addPerson(Person[] array, Person obj){
        Person[] added = new Person[array.length + 1];
        for (int i = 0; i < array.length; i++){
            added[i] = array[i];
        }
        added[array.length] = obj;
        return added;
    }


}


