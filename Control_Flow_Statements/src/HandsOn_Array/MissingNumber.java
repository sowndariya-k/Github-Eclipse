package HandsOn_Array;
import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 int[] arr = new int[100];
		 
		 System.out.print("Enter elements: ");
		  for (int i = 0; i < 99; i++) {
			  arr[i]= input.nextInt();
	        }
		 
		    int n = 100;
	        int expectedSum = n * (n + 1)/2;

	        // actual sum
	        int actualSum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            actualSum += arr[i];
	        }

	        int missing = expectedSum - actualSum;

	        System.out.println("Missing number: " + missing);
	        input.close();
	}

}
