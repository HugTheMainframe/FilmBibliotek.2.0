public class MovieCollection {

    //adding an array of the class Movie and setting it to 5 as limit
    Movie[] movieCollection = new Movie[5];

    //setting a count as an index to the addMovie method
    int count = 0;

    //putting a datatype af Movie and setting index of the Moviearray list to a new Movie object
    //plus incrementing the count.
    public void addMovie(Movie addMovie){
        movieCollection[count] = addMovie;
        count++;
    }

    //for getting the list of movies
    public Movie[] getMovieCollection() {
        return movieCollection;
    }
}
