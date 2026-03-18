package hands_On_Collections;


import java.util.ArrayList;
import java.util.List;
//print longest character above 5
public class LongerCharacter {
	public static void main(String[] args) {
		List<String> arr=new ArrayList<>();
		arr.add("Anu");
		arr.add("Pragathi");
		arr.add("Charlie");
		arr.add("Shiny");
		for(String array:arr) {
			if(array.length()>5) {
			System.out.println(array);
			}
		}
		}

}
