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

    @Override
    public String toString() {
        return movieCollections.toString();
    }
}
