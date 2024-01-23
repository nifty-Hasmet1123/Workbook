// let's create a simple java OOP concepts

// we will create a Movie collection then instantiate it then have a Store class

// as well
package workbook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.2),
            new Movie("T12 Angry Men", "BlueRay", 9.2),   
        };

        // now let's copy the movies 
        Store stores = new Store(movies);

        /************************************* */
        int indexNumber = chooseBetween(movies, sc);

        // updates the rating 
        System.out.println("Enter new rating: ");
        double value = sc.nextDouble();

        // set the value
        stores.setRating(value, indexNumber);

        // let's try and print
        for (Movie movieString : stores.getAll()) {
            System.out.println(movieString);
        }

        // this will not overwrite the original because we created a new copy
        // let's try
        System.out.println();
        System.out.println(movies[indexNumber]);

        // Be careful always in this issue. 
        // where you can mutate the original as well 
    }

    public static int chooseBetween(Movie[] movies, Scanner sc) {
        while (true) {
            String chooseNumber = String.format(
                "Please choose an integer between 0 - %d: ", 
                movies.length - 1
            );
            System.out.println(chooseNumber);

            try {
                int number = sc.nextInt();

                if (number >= movies.length || number < 0) {
                    System.err.println("Out of range enter again.");

                    // consumes the invalid input to avoid infinite loop
                    sc.nextLine();

                    // then call a recursion call
                    return chooseBetween(movies, sc);
                }

                return number;
            
            } catch (InputMismatchException err) {
                System.err.println("Restarting because of invalid input: " + err);

                sc.nextLine();

                return chooseBetween(movies, sc);
            }
        }
    }
}