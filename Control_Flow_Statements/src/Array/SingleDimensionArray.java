package Array;
/**
* The SingleDimensionArray class implements an application that
* Illustrate the access array elements
*/

public class SingleDimensionArray {

	public static void main(String[] args) {
		int[] marks= new int[5];
		marks[0]=89;//assign values
		marks[1]=90;
		marks[2]=94;
		marks[3]=96;
		//marks[9]=12;//ArrayIndexOutofBound
		System.out.println("Element at index 0: "+marks[0]);//access
		System.out.println("Element at index 0: "+marks[1]);
		System.out.println("Element at index 0: "+marks[4]);//default value 0
		//System.out.println("Element at index 0: "+marks[5]);//ArrayIndexOutOfBounds error
		
		//for loop
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		//for each loop
		System.out.println("For Each Structure loop ");
		for(int i:marks) {
			System.out.print(i+" ");
		}

	}

}
