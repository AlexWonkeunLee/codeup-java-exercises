package movies;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args){
        Movie[] moviesArr = MoviesArray.findAll();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMovie Menu:\n");
            System.out.println("1. View all movies");
            System.out.println("2. View movies in Animated category");
            System.out.println("3. View movies in Drama category");
            System.out.println("4. View movies in Horror category");
            System.out.println("5. View movies in Sci-fi category");
            System.out.println("6. Add a new movie");
            System.out.println("7. Exit");
            System.out.println("\nSelect your choice:");
            choice = scanner.nextInt();
            while (choice < 1 || choice > 7){
                System.out.println("That is not a valid choice. Please enter again:");
                choice = scanner.nextInt();
            }
            switch (choice){
                case 1:
                    for (Movie movie : moviesArr) {
                        System.out.println(movie.getName() + " --- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("animated")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("drama")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("horror")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : moviesArr) {
                        if (movie.getCategory().equalsIgnoreCase("scifi")){
                            System.out.println(movie.getName() + " --- " + movie.getCategory());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter name of new movie: ");
                    String newName = scanner.next();
                    System.out.println("Enter name of new category: ");
                    String newCategory = scanner.next();
                    Movie newMovie = new Movie(newName, newCategory);
                    moviesArr = addMovie(moviesArr, newMovie);
                    System.out.println("Movie added.");
                    break;
            }
        }while (choice != 7);
        System.out.println("Bye");
    }

    public static Movie[] addMovie(Movie[] array, Movie obj){
        Movie[] added = new Movie[array.length + 1];
        for (int i = 0; i < array.length; i++){
            added[i] = array[i];
        }
        added[array.length] = obj;
        return added;
    }
}
