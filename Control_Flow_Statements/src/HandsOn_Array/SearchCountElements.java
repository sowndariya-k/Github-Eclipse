package HandsOn_Array;

import java.util.*;

public class SearchCountElements {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] arr = new int[25];
		 
		//get 25 numbers
		 System.out.println("Enter Array Elements: ");
		 for(int i=0; i<25; i++) {
			 arr[i]=input.nextInt();
		 }
		 
		 //enter key element for search
		 System.out.print("Enter Key Element: ");
		 int key=input.nextInt();
		 
		 //declare found
		 int count=0;
		 
		 //check element found or not
		 for(int i=0; i<25; i++) {
			 if(arr[i]==key) {
				 count++;
			 }
		 }
		 
		 //display counts
		 if(count>0)
	         System.out.println("Number "+key+" present in "+count+" times");
		 else
			 System.out.println("Number not present");
		 
		 input.close();
	}

}
