package loopingStatements;

public class ForStructure {

	public static void main(String[] args) {
		int MaxSeatCount=5, seatCount=0;
		for(seatCount=0; seatCount<MaxSeatCount;seatCount++) {
			System.out.println("Current seat Availablity: "+ (MaxSeatCount-seatCount));
		}
		System.out.println("Seats are filled");

	}

}
