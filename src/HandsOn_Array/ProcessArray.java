package HandsOn_Array;

import java.util.*;

public class ProcessArray {

	public static void processArray(int[] arr, int size) {

		for (int i = 0; i < size; i++) {

			if (arr[i] % 7 == 0 && arr[i] % 8 == 0) {
				arr[i] = -6; // both black and white
			} else if (arr[i] % 7 == 0) {
				arr[i] = -2; // black number
			} else if (arr[i] % 8 == 0) {
				arr[i] = -9; // white number
			}

		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array Elements: ");
		int[] arr = new int[100];
		int count = 0;

		// Read numbers upto negative
		while (true) {
			int num = input.nextInt();
			if (num < 0) {
				break;
			}
			arr[count] = num;
			count++;
		}

		// Process array
		processArray(arr, count);

		// Print result
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}

		input.close();
	}

}
