package comparableandcoparator.comparator;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    //Use to sort movie by years
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    //Getter methods for accessing private data
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }
}
