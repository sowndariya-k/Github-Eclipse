package HandsOn_Array;

import java.util.*;

public class MergeAndSort {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Array1 input
		System.out.print("Enter number of Elements in Array1: ");
		int M =input.nextInt();
		int X[]=new int[M]; 
		for(int i=0; i<M; i++) {
			X[i]=input.nextInt();
		}
		
		//Array2 input
		System.out.print("Enter number of Elements in Array2: ");
		int N =input.nextInt();
		int Y[]=new int[N]; 
		for(int i=0; i<N; i++) {
			Y[i]=input.nextInt();
		}
		
		//Array3 input
		System.out.print("Enter number of Elements in Array3: ");
		int O =input.nextInt();
		int Z[]=new int[O]; 
		for(int i=0; i<O; i++) {
			Z[i]=input.nextInt();
		}
		
		int total=M+N+O;//add length of 3 arrays
		int[] merge=new int[total];
		int index=0;
		
		//copy array1
		for(int i=0; i<M; i++) {
			merge[index++]=X[i];
		}
		
		//copy array2
		for(int i=0; i<N; i++) {
			merge[index++]=Y[i];
		}
		
		//copy array3
		for(int i=0; i<O; i++) {
			merge[index++]=Z[i];
		}
		
		//bubble sort
		for(int i=0; i<total-1; i++) {
			for(int j=0; j<total-i-1; j++) {
				if(merge[j+1] < merge[j]) {
				int temp = merge[j+1];
				merge[j+1] = merge[j];
				merge[j] = temp;
				}
			}
		}
		
		System.out.println("Merge three Array: ");
		for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
		input.close();
	}

}
