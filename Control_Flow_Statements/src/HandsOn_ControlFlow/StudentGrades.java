package HandsOn_ControlFlow;
import java.util.*;
public class StudentGrades {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		double finalGrade;
		double total=0;
		int count=0;
		
		while(true) {
			System.out.print("Enter Exercise Grade: ");
			double exercise = input.nextDouble();
			
			System.out.print("Enter Exam Grade: ");
			double exam = input.nextDouble();
			
			//check exercise or exam -1 break loop
			if(exercise == -1 || exam == -1) {
				break;
			}
			
			//check range value between 0- 10
			if(exercise < 0 || exercise > 10 || exam < 0 || exam > 10) {
				System.out.println("Invalid grades because Range between 0 - 10 is valid.");
			}
			
			//calculate final grade
			if(exercise >= 5 && exam >= 5) {
				finalGrade = (exercise * 0.30) + (exam * 0.70);
			}
			//minimum of two grades
			else {
				finalGrade = Math.min(exercise, exam);
			}
			
			System.out.println("Final Grade: " + finalGrade);
			
			total+=finalGrade;//sum finalGrade of all student
			count++;
		}
		
		if(count>0) {
			 System.out.println("Total Grade: " + total);
			 System.out.println("Number of Students: " + count);
			 double average = total / count;
	         System.out.println("Average Grade: " + average);
		}
		else {
			System.out.println("No student data enter.");
		}
		
		input.close();
	}

}
