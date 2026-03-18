package hands_On_Collections;
//using set to store and print
import java.util.HashSet;
import java.util.Set;

public class ConcatenatString {

	public static void main(String[] args) {
		Set<String> arr=new HashSet<>();
		arr.add("Java");
		arr.add("Hello");
		arr.add("Programming");
		arr.add("World");
		for(String array:arr) {
			System.out.print(array+" ");
		}

	}

}
