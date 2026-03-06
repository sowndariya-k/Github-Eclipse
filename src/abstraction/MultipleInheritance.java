package abstraction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

interface SearchbyGenre {
	public abstract void SearchbyGenre(String genre);
}

interface SearchbyTitle {
	public abstract void SearchbyTitle(String title);
}

class Movie {

	private String title;
	private String description;
	private int rating;
	private String language;
	private Date releaseDate;
	private String country;
	private String genre;

	public Movie(String title, String description, int rating, String language, Date releaseDate, String country,
			String genre) {
		super();
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.language = language;
		this.releaseDate = releaseDate;
		this.country = country;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public void getMovieDetail() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Title: " + title);
		System.out.println("Description: " + description);
		System.out.println("Rating: " + rating);
		System.out.println("Language: " + language);
		System.out.println("Release Date: " + dateFormat.format(releaseDate));
		System.out.println("Country: " + country);
		System.out.println("Genre: " + genre);
		System.out.println("-----------------------------");
	}
}

class Catalog implements SearchbyTitle, SearchbyGenre {
	private static Date lastUpdated;
	private static List<Movie> MovieList = new ArrayList<Movie>();
	
	public void addMovie(Movie movie) {
	    MovieList.add(movie);
	}

	@Override
	public void SearchbyTitle(String title) {
		for (Movie movie : MovieList) {
			if (movie.getTitle().equals(title)) {
				movie.getMovieDetail();
			}
		}

	}

	@Override
	public void SearchbyGenre(String genre) {
		for (Movie movie : MovieList)
			if (movie.getGenre().equalsIgnoreCase(genre)) {
				movie.getMovieDetail();
			}
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		Catalog c = new Catalog();
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();
		
		String todaydate = dateFormat.format(date);
		System.out.println(todaydate);
		
		Movie M1 = new Movie("AAA", "Drama movie", 3, "English", date, "France", "Action");
        Movie M2 = new Movie("BBB", "Comedy movie", 4, "English", date, "USA", "Comedy");

        c.addMovie(M1);
        c.addMovie(M2);

        System.out.println("Search by Title:");
        c.SearchbyTitle("AAA");

        System.out.println("Search by Genre:");
        c.SearchbyGenre("Comedy");

	}

}
