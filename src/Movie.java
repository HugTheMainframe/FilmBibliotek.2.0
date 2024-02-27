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
    public void setTitle(String title){
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearCreated() {
        return yearCreated;
    }
    public void setYearCreated(int yearCreated){
        this.yearCreated = yearCreated;
    }

    public boolean getIsinColor() {
        return isInColor;
    }
    public void setIsInColor(boolean isInColor){
        this.isInColor = isInColor;
    }

    public int getLengthInMinuts() {
        return lengthInMinuts;
    }
    public void setLengthInMinuts(int lengthInMinuts){
        this.lengthInMinuts = lengthInMinuts;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        String result = "";
        result += "Title: " + title + "\nDirector: " + director + "\nYear created: " + yearCreated + "\nIs In Color: ";
        if(isInColor == true){
            result += " er i farve ";
        } else {
            result += " er ikke i farve ";
        }
        result += "\nLength In Minuts: " + lengthInMinuts + "\nGenre: " + genre + "\n";
        return result;
    }
}
