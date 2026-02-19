package HandsOn_Array;

import java.util.*;

public class GreatestElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr= new int[5];
		
		//get elements 
		System.out.print("Enter Elements: ");
		for(int i=0; i<5; i++) {
			arr[i]=input.nextInt();
		}
		
		int max= arr[0];
		for(int i=0; i<5; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Greatest Element: "+max);
		input.close();
	}

}
