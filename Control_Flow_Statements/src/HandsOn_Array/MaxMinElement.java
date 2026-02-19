package HandsOn_Array;

import java.util.*;

public class MaxMinElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr= new int[5];
		
		//get elements 
		System.out.println("Enter Elements: ");
		for(int i=0; i<5; i++) {
			arr[i]=input.nextInt();
		}
		
		int max= arr[0];
		int min= arr[0];
		for(int i=0; i<5; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum Element in array: "+max);
		System.out.println("Minimum Element in array: "+min);
		input.close();
	}

}
