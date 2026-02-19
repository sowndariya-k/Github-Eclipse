package OOPS;
public class TheatreScreen{
	private static int totalSeats=20;
	
	TheatreScreen(){
		System.out.println("Current Seat Availability: "+totalSeats);
	}
	
	public void DisplayTheatreScreen() {
		System.out.println("Current Seat Availability: "+totalSeats);
	}
	
	public static void BookTicket(int nooftickets) {
		System.out.println("No. of Seats Booked: "+nooftickets);
		totalSeats -= nooftickets;
	}

	public static void main(String[] args) {
		System.out.println("Screen availability status: ");
		TheatreScreen TS1= new TheatreScreen();
		TS1.BookTicket(4);
		TheatreScreen TS2= new TheatreScreen();
		TS2.BookTicket(5);
		TS2.DisplayTheatreScreen();

	}

}
