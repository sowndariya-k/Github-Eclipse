package hands_On_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class NumberAnalysis {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        TreeSet<Integer> set = new TreeSet<>();

	        while (true) {
	            System.out.print("Enter a number (or type 'done' to finish): ");
	            String input = sc.next();

	            if (input.equalsIgnoreCase("done")) {
	                break;
	            }

	            set.add(Integer.parseInt(input));
	        }

	        // Display sorted unique numbers
	        System.out.println("Sorted unique numbers: " + set);

	        // Average
	        double sum = 0;
	        for (int n : set) {
	            sum += n;
	        }
	        System.out.println("Average: " + (sum / set.size()));

	        // Min and Max
	        System.out.println("Lowest: " + set.first());
	        System.out.println("Highest: " + set.last());

	        // Odd numbers
	        List<Integer> odd = new ArrayList<>();
	        for (int n : set) {
	            if (n % 2 != 0) {
	                odd.add(n);
	            }
	        }

	        System.out.println("Odd numbers: " + odd);
	    }

}
