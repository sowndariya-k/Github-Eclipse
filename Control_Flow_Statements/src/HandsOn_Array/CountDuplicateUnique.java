package HandsOn_Array;

import java.util.*;

public class CountDuplicateUnique {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			//Size of array
			System.out.print("Enter Array Size: ");
			int n=input.nextInt();
			
			 int[] arr = new int[n];
			 
			 //get elements
			 System.out.println("Enter Array Elements: ");
			 for(int i=0; i<n; i++) {
				 arr[i]=input.nextInt();
			 }
			 
			 //initialize
			 int duplicateCount=0, uniqueCount=0;
			 
			 //create visited array
			 boolean[] visited = new boolean[arr.length];
			 for (int i = 0; i < n; i++) {
		            if (visited[i]) {
		                continue;
		            }

		            int count = 1;

		            for (int j = i + 1; j < n; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                    visited[j] = true;
		                }
		            }
		            
		            if(count>1) 
		            	duplicateCount++;
		            else 
		            	uniqueCount++;
		        }
			 System.out.println("No. of Duplicate Elements in array: "+duplicateCount);
			 System.out.println("No. of Unique Elements in array: "+uniqueCount);
			 input.close();
		}

	}

