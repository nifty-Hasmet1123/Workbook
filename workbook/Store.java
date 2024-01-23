package workbook;

public class Store {
    private Movie[] movies;

    // let's create a deep copy of the Movie instances
    public Store(Movie[] movies) {
        // create a new array
        this.movies = new Movie[movies.length];

        // now for every array instantiate again the Movie class
        for (int i = 0; i < movies.length; i++) {
            this.movies[i] = new Movie(movies[i]);
        }
    }

    // let's also create a setRating here
    public void setRating(double value, int index) {
        this.movies[index].setRating(value);
    }

    public Movie[] getAll() {
        return this.movies;
    }
}