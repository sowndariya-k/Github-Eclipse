package Function;
/**
 * The FunctionDeclare class implements an application that displays movie details 
 * using the user defined method(static)
 */
public class FunctionDeclare {
	static void getMovieDetails(String movieName, String movieDescription, int movieDuration, String movieLanguage,
			String movieReleaseDate, String movieCountry, String movieGenre) {
		System.out.println("Movie Title: "+movieName);
		System.out.println("Movie Description: "+movieDescription);
		System.out.println("Movie Duration: "+movieDuration);
		System.out.println("Movie Language: "+movieLanguage);
		System.out.println("Movie Release Date: "+movieReleaseDate);
		System.out.println("Movie Country: "+movieCountry);
		System.out.println("Movie Genre: "+movieGenre);
	}
	
	public static void main(String[] args) {
		String movieName="AAA";
		String movieDescription="Dramaof1945";
		int movieDuration=3;
		String movieLanguage="English";
		String movieReleaseDate="25/03/2026";
		String movieCountry= "XYZ";
		String movieGenre= "THRILLER";
		System.out.println("---------Movie Details--------");
		getMovieDetails(movieName, movieDescription, movieDuration, movieLanguage, movieReleaseDate, movieCountry, movieGenre);
		System.out.println("------------------------------");
	}

}
