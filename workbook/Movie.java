package workbook;

public class Movie {
    // let's create some attributes for initialization
    private String title;
    private String make;
    private double rating;


    // constructor
    public Movie(String title, String make, double rating) {
        this.title = title;
        this.make = make;
        this.rating = rating;
    }

    // let's create a copy constructor as well
    public Movie(Movie source) {
        this.title = source.title;
        this.make = source.make;
        this.rating = source.rating;
    }

    // now's let's create some getter and setters
    public String getTitle() {
        return this.title;
    }

    public String getMake() {
        return this.make;
    }

    public double getRating() {
        return this.rating;
    }

    // now for the setters
    public void setTitle(String value) {
        this.title = value;
    }

    public void setMake(String value) {
        this.make = value;
    }

    public void setRating(double value) {
        this.rating = value;
    }

    // string representation
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
            .append(this.rating)
            .append("\t\t")
            .append(this.make)
            .append("\t\t")
            .append(this.title);

        return stringBuilder.toString();
    }
}