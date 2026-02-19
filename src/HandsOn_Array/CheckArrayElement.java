package HandsOn_Array;
import java.util.*;
public class CheckArrayElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int n=input.nextInt();
		
		 int[] arr = new int[n];
		 
		 System.out.println("Enter Array Elements: ");
		 for(int i=0; i<n; i++) {
			 arr[i]=input.nextInt();
		 }
		 
		 //enter key element for search
		 System.out.print("Enter Key Element: ");
		 int key=input.nextInt();
		 
		 //declare found
		 boolean found= false;
		 
		 //check element found or not
		 for(int i=0; i<n; i++) {
			 if(arr[i]==key) {
				 found=true;
				 break;
			 }
		 }
		 
		 System.out.println(key+" found in Array: "+found);
		 input.close();
	}

}
