import java.util.Objects;

public class Movie {

    private int id;
    private String title;
    private int year;
    private String genre;
    private String director;

    Movie(){}

    Movie(int id, String title, int year, String genre, String director){
        this.id= id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public String toString() {
        return String.format("%s,%d %s %s/n", title, year, genre, director);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                year == movie.year &&
                Objects.equals(title, movie.title) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, year, genre, director);
    }
}
