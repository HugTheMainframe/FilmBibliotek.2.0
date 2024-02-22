import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieCollection movieList = new MovieCollection();
        Controller myController = new Controller();
        int i = 0;

        while(true) {
            System.out.println("Welcome to my movie collection");
            System.out.println("1. Add a Movie");
            System.out.println("2. Print Movie Collection");
            System.out.println("3. Print single movie info");
            System.out.println("4. Quit");
            int dicision = input.nextInt();

            if(dicision == 1) {
                //inout object plus user input fields per movie
                System.out.print("Enter the title of the film: ");
                input.nextLine();
                String title = input.nextLine();
                System.out.print("Enter the director of the film: ");
                String director = input.nextLine();
                System.out.print("Enter the year of the film: ");
                int yearCreated = input.nextInt();
                System.out.print("Enter if the film is in color(yes or no): ");
                Boolean isInColor = input.next().equalsIgnoreCase("yes");
                System.out.print("Enter the length of the film(in minuts): ");
                int lengthInMinuts = input.nextInt();
                System.out.print("Enter the genre of the film: ");
                String genre = input.next();
                Movie movieOne = new Movie(title, director, yearCreated,
                        isInColor, lengthInMinuts, genre);
                movieList.addMovie(movieOne);

            } else if (dicision == 2){
                System.out.println("My Movie Collection:");
                System.out.println(movieList);

            } else if (dicision == 3){
                //Viker ikke...
                System.out.println("Here is the movie you were looking for:");
                String listt = movieList.searchMovie("bob");
                System.out.println(listt);

            } else if (dicision == 4){
                System.out.println("Quitting...");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

    }


}
