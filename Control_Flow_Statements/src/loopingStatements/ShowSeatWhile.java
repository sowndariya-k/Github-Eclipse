package loopingStatements;

public class ShowSeatWhile {

	public static void main(String[] args) {
		int MaxSeatCount=10, seatCount=0;
		while(seatCount<MaxSeatCount) {
			System.out.println("Current Seat Availability: "+(MaxSeatCount-seatCount));
			seatCount++;
		}
		System.out.println("Seats are Filled");
	}

}
