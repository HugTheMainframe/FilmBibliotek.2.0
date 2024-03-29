import java.util.ArrayList;

public class Controller {
    private MovieCollection movieCollections;

    public Controller(){
        this.movieCollections = new MovieCollection();
    }
    public void addMovie(Movie movie){
        movieCollections.addMovie(movie);
    }

    public String title(String title){
        return movieCollections.searchMovie(title);
    }

    public Movie searchMovie(String title){
        return movieCollections.searchMovietest(title);
    }

    public void changeMovie(Movie movie, String newTitle, String newDirector, int newYearCreated,
                              boolean newIsInColor, int newLengthInMinuts, String newGenre){
        movieCollections.editMovieSearch(movie, newTitle, newDirector, newYearCreated, newIsInColor,
                newLengthInMinuts, newGenre);
    }

    @Override
    public String toString() {
        return movieCollections.toString();
    }
}
