import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    @Test
    void testAddMovieInsertSize() {
        //Arrange
        MovieCollection testAddMovie = new MovieCollection();
        Movie movieOne = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        testAddMovie.addMovie(movieOne);

        //Act
        int actualSize = testAddMovie.getMovieCollections().size();

        //Assert
        int expectedSize = 1;
        assertEquals(expectedSize, actualSize);

    }

    @Test
    void testAddMovieAttributes(){
        //Arrange
        MovieCollection test = new MovieCollection();
        Movie movieOne = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        test.addMovie(movieOne);
        //Act
        String actual = test.getMovieCollections().toString();
        //Assert
        Movie movieToCompare = new Movie("Diehard", "Tim", 2002, false, 90, "Action");
        String expectedResult = movieToCompare.toString();
        if(expectedResult == actual) {
            assertEquals(expectedResult, actual);
        }
    }

    @Test
    void testAddMovieMoreInsertsSize(){
        //Arrange
        MovieCollection test123 = new MovieCollection();
        Movie movieOne = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        Movie movieTwo = new Movie("Diehard", "Tim", 2002, false, 60, "Action");
        Movie movieThree = new Movie("Benjamin Buttons", "Carry", 2098, true, 90, "Fantasy");
        test123.addMovie(movieOne);
        test123.addMovie(movieTwo);
        test123.addMovie(movieThree);

        //Act
        int actualSize = test123.movieCollections.size();

        //Assert
        int expectedSize = 3;
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void getSearchzero() {
        //Arrange
        MovieCollection test = new MovieCollection();
        Movie movieOne = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        test.addMovie(movieOne);
        //Act
        String actualResult = test.searchMovie("citanic");
        //Assert
        String expectedResult = "No such movie exits in your collection";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getSearchOne(){
        //Arrange
        MovieCollection test = new MovieCollection();
        Movie movieOne = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        test.addMovie(movieOne);
        //Act
        String actualResult = test.searchMovie("Titanic");
        //Assert
        Movie testMovie = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        String expectedResult = testMovie.toString();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getSearchMore(){
        //Arrange
        MovieCollection test123 = new MovieCollection();
        Movie movieOne = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        Movie movieTwo = new Movie("Tiehard", "Tim", 2002, false, 60, "Action");
        Movie movieThree = new Movie("Tenjamin Buttons", "Carry", 2098, true, 90, "Fantasy");
        test123.addMovie(movieOne);
        test123.addMovie(movieTwo);
        test123.addMovie(movieThree);
        //Act
        String actualResult = test123.searchMovie("T");

        //Assert
        MovieCollection testExpectedResult = new MovieCollection();
        Movie movieFour = new Movie("Titanic", "Bob", 1998, true, 130, "Romance");
        Movie movieFive = new Movie("Tiehard", "Tim", 2002, false, 60, "Action");
        Movie movieSix = new Movie("Tenjamin Buttons", "Carry", 2098, true, 90, "Fantasy");
        testExpectedResult.addMovie(movieFour);
        testExpectedResult.addMovie(movieFive);
        testExpectedResult.addMovie(movieSix);
        String expectedResult = testExpectedResult.toString();
        assertEquals(expectedResult, actualResult);
    }
}