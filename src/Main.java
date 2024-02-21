import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inout object plus user input fields per movie
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the title of the film: ");
        String title = input.nextLine();
        System.out.print("Enter the director of the film: ");
        String director = input.nextLine();
        System.out.print("Enter the year of the film: ");
        int yearCreated = input.nextInt();
        System.out.print("Enter if the film is in color(true or false): ");
        boolean isInColor = input.nextBoolean();
        System.out.print("Enter the length of the film(in minuts): ");
        int lengthInMinuts = input.nextInt();
        System.out.print("Enter the genre of the film: ");
        //must be next else it skips the input
        String genre = input.next();

        //testing object for input
        Movie movieOne = new Movie(title, director, yearCreated,
                isInColor, lengthInMinuts, genre);
//
//
        //testing for output of the objects getters
//        System.out.println(movieOne.getTitle() + "\n" + movieOne.getDirector() + "\n" +
//                movieOne.getYearCreated() + "\n" + movieOne.getIsinColor() + "\n" +
//                 movieOne.getLengthInMinuts() + "\n" + movieOne.getGenre());

        //testing the MovieCollection class for the addMovie method
        MovieCollection movieList = new MovieCollection();
        //adding the movieOne to the list
        movieList.addMovie(movieOne);
        //receive the movieList getter and storing it in a Movie class array
        Movie[] listFirstMovie = movieList.getMovieCollection();
        //output the array with the first movie attributes with index 0 (movieOne)
        System.out.println(listFirstMovie[0].getTitle());

    }


}
