import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieCollections = new ArrayList<Movie>();

    public void addMovie(Movie addMovie){
        movieCollections.add(addMovie);
    }

    public String searchMovie(String movieTitle){
        String result = "";
        for (Movie movie : movieCollections){
            if(movie.getTitle().toLowerCase().contains(movieTitle.toLowerCase())){
                System.out.println(result);
                result = movie.toString();
            } else {
                result = "No such movie exits in your collection";
            }
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
