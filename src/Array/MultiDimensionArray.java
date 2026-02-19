package Array;
/** 
 * The MultiDimensionArray class implements an application that illustrate the access of multidimensional 
 * array elements **/
public class MultiDimensionArray {

	public static void main(String[] args) {
		int[][] x= new int[][] {{1,2}, {3,4}, {5,6}};
		for(int i=0; i<x.length; i++) {
			//print array elements
			for(int j=0; j<x[i].length; j++) {//x[i] is for length of the row
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}

	}

}
