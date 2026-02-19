package OOPS;

public class TheatreConstructor {
	int theatreId;
	String theatreName;
	int theatreScreen;
	String theatreLocation;
	
	TheatreConstructor(int tid, String tname, int screen, String location){
		theatreId=tid;
		theatreName=tname;
		theatreScreen=screen;
		theatreLocation=location;
	}
	
	public void getTheatreDetails(){
		System.out.println("--------Theatre Details-------");
		System.out.println("Theatre ID: "+theatreId);
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Name: "+theatreScreen);
		System.out.println("Theatre Name: "+theatreLocation);
		
	}

	public static void main(String[] args) {
		TheatreConstructor T=new TheatreConstructor(0, null, 0, null);
		T.getTheatreDetails();

	}

}
