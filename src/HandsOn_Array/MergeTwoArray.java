package HandsOn_Array;

import java.util.*;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Array1 input
		System.out.print("Enter number of Elements in Array1: ");
		int num1 =input.nextInt();
		int arr1[]=new int[num1]; 
		for(int i=0; i<num1; i++) {
			arr1[i]=input.nextInt();
		}
		
		//Array2 input
		System.out.print("Enter number of Elements in Array2: ");
		int num2 =input.nextInt();
		int arr2[]=new int[num2]; 
		for(int i=0; i<num2; i++) {
			arr2[i]=input.nextInt();
		}
		
		
		int total=num1+num2;//add length of 2 arrays
		int[] merge=new int[total];
		int index=0;
		
		//copy array1
		for(int i=0; i<num1; i++) {
			merge[index++]=arr1[i];
		}
		
		//copy array2
		for(int i=0; i<num2; i++) {
			merge[index++]=arr2[i];
		}
		
		//merge two arrays
		System.out.println("Merge Two arrays: ");
		for(int i=0; i<total; i++) {
			System.out.print(merge[i]+ " ");
		}
		
		input.close();
	}

}
