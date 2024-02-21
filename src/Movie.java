public class Movie {

    //Instances fields for the movie to have, plus private so it cant be change easily by users.
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor = false;
    private int lengthInMinuts;
    private String genre;

    //Constructor to set new instances fields for every new object called.
    public Movie(String title, String director, int yearCreated, boolean isInColor,
                 int lengthInMinuts, String genre){
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinuts = lengthInMinuts;
        this.genre = genre;
    }

    //list of getters for receiving info about movie.
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsinColor() {
        return isInColor;
    }

    public int getLengthInMinuts() {
        return lengthInMinuts;
    }

    public String getGenre() {
        return genre;
    }
}
