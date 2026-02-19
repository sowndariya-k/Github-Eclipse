package HandsOn_Array;

import java.util.*;

public class EqualChocolates {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Number of Friends: ");
		int N = input.nextInt();
		
		int[] arr=new int[N];
		int total=0;
		
		//get chocolate values
		for(int i=0; i<N;i++) {
			arr[i]= input.nextInt();
			total+= arr[i];
		}
		
		//check equal given
		if(total % N == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		input.close();
	}

}
