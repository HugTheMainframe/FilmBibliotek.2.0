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
                result += movie.toString();
            } else {
                result = "No such movie exits in your collection";
            }
        }
        return result;
    }

    public void editMovieSearch(String title, String newTitle, String newDirector, int newYearCreated,
                                boolean newIsInColor, int newLengthInMinuts, String newGenre){
        for (Movie movie : movieCollections){
            if(movie.getTitle().equalsIgnoreCase(title)){
                movie.setTitle(newTitle);
                movie.setDirector(newDirector);
                movie.setYearCreated(newYearCreated);
                movie.setIsInColor(newIsInColor);
                movie.setLengthInMinuts(newLengthInMinuts);
                movie.setGenre(newGenre);
                break;
            }
        }
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
