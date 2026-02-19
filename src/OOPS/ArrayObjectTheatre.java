package OOPS;

public class ArrayObjectTheatre {
	int theatreId;
	String theatreName;
	int theatreScreen;
	String theatreAddress;
	
	public void setTheatre(int id, String name, int count, String address) {
		theatreId=id;
		theatreName=name;
		theatreScreen=count;
		theatreAddress=address;
	}
	
	public void getTheatreDetails(){
		System.out.println("--------Theatre Details-------");
		System.out.println("Theatre ID: "+theatreId);
		System.out.println("Theatre Name: "+theatreName);
		System.out.println("Theatre Name: "+theatreScreen);
		System.out.println("Theatre Name: "+theatreAddress);
		
	}

	public static void main(String[] args) {
		ArrayObjectTheatre T[]=new ArrayObjectTheatre[3];
		for(int i=0; i<T.length; i++) {
			T[i]=new ArrayObjectTheatre();
		}
		T[0].setTheatre(4523, "INOX", 12, "Kochi");
		T[1].setTheatre(4742, "PVR", 12, "Chennai");
		T[2].setTheatre(4523, "INOX", 12, "Salem");
		
		for (int i = 0; i < T.length; i++) {
            T[i].getTheatreDetails();
        }

	}

}
