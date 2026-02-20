package HandsOn_ControlFlow;

import java.util.*;

public class Calendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Month Number: ");
		int month = input.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("Invalid Month");
		}

		System.out.print("Enter Start day (1=Mon, 7=Sun): ");
		int startDay = input.nextInt();

		int days = 0;

		// number of days in month
		if (month == 2) {
			System.out.print("Enter number of days in Feburary(28 or 29): ");
			days = input.nextInt();
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}

		// print calendar days
		System.out.println("\nMon Tue Wed Thu Fri Sat Sun");

		int currentDay = 1;
		// before first day starts give space
		for (int i = 1; i < startDay; i++) {
			System.out.print("    ");
			currentDay++;
		}

		// print days
		for (int d = 1; d <= days; d++) {
			System.out.printf("%3d ", d);

			if (currentDay % 7 == 0) {
				System.out.println();
			}
			currentDay++;
		}
		System.out.println("\n");

		input.close();
	}

}
