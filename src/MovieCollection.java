import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieCollections = new ArrayList<Movie>();

    public void addMovie(Movie addMovie){
        movieCollections.add(addMovie);
    }

//virker ikke...
    public String searchMovie(String movieTitle){
        String result = "";
        for (Movie movie : movieCollections){
            if(movie.getTitle().equals(movieTitle)){
                result = movie.toString();
                return result;
            }
            return result;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Movie movie : movieCollections){
            result += movie;
        }
        return result;
    }


}
