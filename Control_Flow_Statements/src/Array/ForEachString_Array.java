package Array;
/**
* The ForEachstring_Array class implements an application that
* Illustrate the access array elements
*/
public class ForEachString_Array {

	public static void main(String[] args) {
		String[] custName = new String[5];
		custName[0]="Aaron";
		custName[1]="Kavin";
		custName[2]="Jesicca";
		custName[3]="Rishabh";
		custName[4]="Vinitha";
		System.out.println("Elements in the String Array");

		for(String arr:custName) {
			System.out.println(arr);
		}
	}

}
