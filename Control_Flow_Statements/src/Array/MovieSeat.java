package Array;
/** 
 * The MovieSeat class implements an application that illustrate the access of multidimensional 
 * array elements
 */
public class MovieSeat {

	public static void main(String[] args) {
		String [][] seatType= new String[][] {{"B","B","A","A","A"},{"A","A","A","B","B"},
			{"A","B","B","B","B"},{"B","A","A","B","A"}
		};
		
		int vipCount=0, premiumCount=0, regularCount=0, vipTotal=5, premiumTotal=10, regularTotal=5;
		
		System.out.println("MOVIE SEATS ARRANGEMENT..");
		//Seat availability
		for(int i=0; i<seatType.length; i++) {
			if(i==0) {
				System.out.println("------- VIP SEATS --------");
			}
			else if(i==1) {
				System.out.println("----- PREMIUM SEATS ------");
			}
			else if(i==3) {
				System.out.println("----- REGULAR SEATS ------");
			}
			
			for(int j=0; j<seatType[i].length; j++) {
				System.out.print(" "+seatType[i][j]+" ");
				if(i==0 && seatType[i][j].equalsIgnoreCase("B")) {
					vipCount++;
				}
				else if(i>0 && i<3 && seatType[i][j].equalsIgnoreCase("B")) {
					premiumCount++;
				}
				else if(i==3 && seatType[i][j].equalsIgnoreCase("B")) {
					regularCount++;
				}
			}
				System.out.println();
		}
		System.out.println("----- SEAT BOOKED DETAILS -----");
		System.out.println("---------- VIP SEATS ----------");
		System.out.println("BOOKED: "+vipCount+" AVAILABLE: "+(vipTotal-vipCount)+" TOTAL: "+vipTotal);
		System.out.println("-------- PREMIUM SEATS --------");
		System.out.println("BOOKED: "+premiumCount+" AVAILABLE: "+(premiumTotal-premiumCount)+" TOTAL: "+premiumTotal);
		System.out.println("-------- REGULAR SEATS --------");
		System.out.println("BOOKED: "+regularCount+" AVAILABLE: "+(regularTotal-regularCount)+" TOTAL: "+regularTotal);
		
		

	}

}
