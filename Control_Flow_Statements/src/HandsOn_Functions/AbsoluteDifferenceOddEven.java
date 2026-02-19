package HandsOn_Functions;

public class AbsoluteDifferenceOddEven {
	
	public static int oddSum(int arr[]) {
		int sumOddElements=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				sumOddElements+=arr[i];
			}
		}
		return sumOddElements;
	}
	
	public static int evenSum(int arr[]) {
		int sumEvenElements=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sumEvenElements+=arr[i];
			}
		}
		return sumEvenElements;
	}

	public static void main(String[] args) {
		
		int n=1000;
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=i+1;
		}
		
		int oddElements=oddSum(arr);
		int evenElements=evenSum(arr);
		int absolute= Math.abs(evenElements - oddElements);
		
		System.out.println("The sum of odd numbers from 1 to 1000 is: "+oddElements);
		System.out.println("The sum of even numbers from 1 to 1000 is: "+evenElements);
		System.out.println("Absolute Difference between the two sums is: "+absolute);

	}

}
