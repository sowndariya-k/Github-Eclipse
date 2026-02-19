package OOPS;

public class Theatre {
	int theatreId=4523;
	String theatreName= "INOX";
	String theatreLocation="Kochi";
	
	public void displayTheatre() {
		System.out.println("Theatre ID: "+theatreId);
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Location: "+theatreLocation);
	}

	public static void main(String[] args) {
		Theatre th= new Theatre();
		th.displayTheatre();

	}

}
