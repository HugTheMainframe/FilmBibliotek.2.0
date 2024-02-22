import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieCollection movieList = new MovieCollection();
        int i = 0;

        while(true) {
            System.out.println("Welcome to my movie collection");
            System.out.println("1. Add a Movie");
            System.out.println("2. Quit");
            int dicision = input.nextInt();
            if(dicision == 1) {
                //inout object plus user input fields per movie
                System.out.print("Enter the title of the film: ");
                String title = input.next();
                System.out.print("Enter the director of the film: ");
                String director = input.next();
                System.out.print("Enter the year of the film: ");
                int yearCreated = input.nextInt();
                System.out.print("Enter if the film is in color(true or false): ");
                boolean isInColor = input.nextBoolean();
                System.out.print("Enter the length of the film(in minuts): ");
                int lengthInMinuts = input.nextInt();
                System.out.print("Enter the genre of the film: ");
                String genre = input.next();
                Movie movieOne = new Movie(title, director, yearCreated,
                        isInColor, lengthInMinuts, genre);
                movieList.addMovie(movieOne);
                Movie[] listFirstMovie = movieList.getMovieCollection();
                System.out.println(listFirstMovie[i].getTitle());
                i++;
            } else if (dicision == 2){
                System.out.println("Quitting...");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }


        //testing the MovieCollection class for the addMovie method
//        MovieCollection movieList = new MovieCollection();
        //adding the movieOne to the list
//        movieList.addMovie(movieOne);
        //receive the movieList getter and storing it in a Movie class array
//        Movie[] listFirstMovie = movieList.getMovieCollection();
        //output the array with the first movie attributes with index 0 (movieOne)
//        System.out.println(listFirstMovie[0].getTitle());

    }


}
