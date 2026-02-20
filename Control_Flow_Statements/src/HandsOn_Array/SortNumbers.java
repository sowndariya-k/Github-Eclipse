package HandsOn_Array;
import java.util.*;

public class SortNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of Elements in Array: ");
		int num =input.nextInt();
		int arr[]=new int[num]; 
		for(int i=0; i<num; i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<num-i-1; j++) {
				if(arr[j+1]<arr[j]) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for(int i=0; i<num; i++) {
			System.out.print(arr[i]+" ");
		}
		input.close();
	}

}
