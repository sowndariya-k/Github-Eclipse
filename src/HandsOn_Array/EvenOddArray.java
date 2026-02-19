package HandsOn_Array;

public class EvenOddArray {

	public static void main(String[] args) {
		int odd[]=new int[5];
		int even[]=new int[5];
		int oddCount=0, evenCount=0, sumOdd=0, sumEven=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				even[evenCount]=i;
				sumEven+=i;
				evenCount++;
			}
			else {
				odd[oddCount]=i;
				sumOdd+=i;
				oddCount++;
			}
		}
		System.out.print("Odd Array: ");
		for(int i=0; i<5; i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		System.out.println("Odd Array Sum: "+sumOdd);
		
		System.out.print("Even Array: ");
		for(int i=0; i<5; i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.println("Even Array Sum: "+sumEven);
		
	}

}
