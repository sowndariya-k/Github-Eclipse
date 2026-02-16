package MovieBooking_Example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class MovieBooking {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Movie ID : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Movie Name : ");
		String name=sc.nextLine();
		
		System.out.print("Enter Movie Description : ");
		String description=sc.nextLine();
		
		System.out.print("Enter Movie Language : ");
		String lang=sc.nextLine();
		
		System.out.print("Enter Movie Genre : ");
		String moviegenre=sc.nextLine();
		
		System.out.print("Enter Movie release date (dd/MM/yyyy) : ");
		String date=sc.next();
		SimpleDateFormat moviereleasedate= new SimpleDateFormat("dd/MM/yyyy");// Month always caps
		Date moviedate=moviereleasedate.parse(date);
		sc.nextLine();
		
		System.out.print("Enter Movie Seat Cost : ");
		double cost=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("ENTERED MOVIE DETAILS ARE");
		System.out.println("Movie ID : "+id);
		System.out.println("Movie Name : "+name);
		System.out.println("Movie Description : "+description);
		System.out.println("Movie Language : "+lang);
		System.out.println("Movie Genre : "+moviegenre);
		System.out.println("Movie Date : "+moviedate);
		System.out.println("Seat Cost : "+cost);
		sc.close();
	}

}
