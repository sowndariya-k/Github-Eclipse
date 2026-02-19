package HandsOn_Array;

import java.util.*;

public class UniqueElementList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Size of array
		System.out.print("Enter Array Size: ");
		int n=input.nextInt();
		
		 int[] arr = new int[n];
		 int[] unique= new int[n];
		 int index=0;
		 
		 //get elements
		 System.out.println("Enter Array Elements: ");
		 for(int i=0; i<n; i++) {
			 arr[i]=input.nextInt();
		 }
		 
		 //find unique elements
		 for (int i = 0; i < n; i++) {
			 boolean isDuplicate = false;

	            for (int j = 0; j < index; j++) {// 0-index already stored element in unique array
	                if (arr[i] == arr[j]) {
	                	isDuplicate = true;
	                	break;
	                }
	            }
	            
	            if(!isDuplicate) {
	            	unique[index]=arr[i];
	            	index++;
	            }
		 }
		 
		 //print unique elements array
		 System.out.println("Unique elements:");
	        for (int i = 0; i < index; i++) {
	            System.out.print(unique[i] + " ");
	        }
	        input.close();

	}

}
