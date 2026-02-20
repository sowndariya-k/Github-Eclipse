package HandsOn_Functions;
import java.util.*;
public class SumOddEven {
	static void calculateSum(int arr[]) {
		int sumOdd=0, sumEven=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sumEven+=arr[i];
			}
			else {
				sumOdd+=arr[i];
			}
		}
		System.out.println("Even Sum: "+sumEven);
		System.out.println("Odd Sum: "+sumOdd);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int n=input.nextInt();
		
		 int[] arr = new int[n];
		
		 System.out.print("Enter elements: ");
		  for (int i = 0; i < n; i++) {
			  arr[i]= input.nextInt();
	        }
		  
		  calculateSum(arr); 
		  input.close();
	}

}
