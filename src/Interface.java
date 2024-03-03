import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    private Controller myController;
    Scanner input = new Scanner(System.in);

    public Interface(){
        this.myController = new Controller();
    }


    public void makeMovie(){
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
        myController.addMovie(movieOne);
    }

    public void printMovieCollection(){
        System.out.println("My Movie Collection:");
        System.out.println(myController.toString());
    }

    public void printSearchedMovies(){
        System.out.print("Please type the movie you are searching for: ");
        String movieSearch = input.next();
        System.out.println("Here is the movie you were looking for:\n");
        String printMovieInfo = myController.title(movieSearch);
        System.out.print(printMovieInfo);
//                System.out.print("Press enter to continue");
    }

    public int printWelcome(){
        System.out.println("Welcome to my movie collection");
        System.out.println("1. Add a Movie");
        System.out.println("2. Print Movie Collection");
        System.out.println("3. Search movie info");
        System.out.println("4. Edit one of your movies");
        System.out.println("5. Quit");
        int userDicision = input.nextInt();
        return userDicision;
    }

    public void editMovie(){
        System.out.print("Please type in the movie you would change: ");
        input.nextLine();
        String movieSearch = input.nextLine();
        Movie movie = myController.searchMovie(movieSearch);

        System.out.println("1. for changing the title");
        System.out.println("2. for changing the Director ");
        System.out.println("3. for changing the which year movie was made ");
        System.out.println("4. for changing the is movie in color ");
        System.out.println("5. for changing the Length of the movie ");
        System.out.println("6. for changing the Genre ");
        System.out.println("7. for overwriting the whole movie");
        System.out.println("8. to quit");
        String userDicision = input.nextLine();
        switch (userDicision) {
            case "1":
                System.out.print("Enter the new title of the film: ");
                String newTitle = input.nextLine();
                movie.setTitle(newTitle);
                break;
            case "2":
                System.out.print("Enter the a new director of the film: ");
                String director = input.nextLine();
                movie.setDirector(director);
                break;
            case "3":
                System.out.print("Enter the a new year of the film: ");
                int yearCreated = input.nextInt();
                movie.setYearCreated(yearCreated);
                break;
            case "4":
                System.out.print("Enter if the film is in color(yes or no): ");
                Boolean isInColor = input.next().equalsIgnoreCase("yes");
                movie.setIsInColor(isInColor);
                break;
            case "5":
                System.out.print("Enter the a new length of the film(in minuts): ");
                int lengthInMinuts = input.nextInt();
                movie.setLengthInMinuts(lengthInMinuts);
                break;
            case "6":
                System.out.print("Enter the a new genre of the film: ");
                String genre = input.next();
                movie.setGenre(genre);
                break;
            case "7":
                System.out.print("Enter the new title of the film: ");
                String title = input.nextLine();
                System.out.print("Enter the a new director of the film: ");
                director = input.nextLine();
                System.out.print("Enter the a new year of the film: ");
                yearCreated = input.nextInt();
                System.out.print("Enter if the film is in color(yes or no): ");
                isInColor = input.next().equalsIgnoreCase("yes");
                System.out.print("Enter the a new length of the film(in minuts): ");
                lengthInMinuts = input.nextInt();
                System.out.print("Enter the a new genre of the film: ");
                genre = input.next();
                myController.changeMovie(movie, title, director, yearCreated, isInColor, lengthInMinuts, genre);
                break;
        }
    }

    public void startProgram(){

        while(true) {
            int userDicision = printWelcome();

            if(userDicision == 1) {
                makeMovie();

            } else if (userDicision == 2){
               printMovieCollection();

            } else if (userDicision == 3) {
                printSearchedMovies();

            } else if (userDicision == 4){
                editMovie();

            } else if (userDicision == 5){
                System.out.println("Quitting...");
                break;

            } else {
                System.out.println("Invalid input");
            }
        }
    }


}
