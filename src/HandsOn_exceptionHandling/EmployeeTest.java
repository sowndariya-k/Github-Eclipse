package HandsOn_exceptionHandling;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class InvalidEmpNumberException extends Exception {}
class InvalidDateOfJoinException extends Exception {}

// Employee class
class Employee {
    int empCode;
    String name;
    LocalDate dob;
    LocalDate doj;

    Employee(int empCode, String name, LocalDate dob, LocalDate doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    void display() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Date of Joining: " + doj);

        int exp = Period.between(doj, LocalDate.now()).getYears();
        System.out.println("Experience: " + exp + " years");
    }
}


public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Code: ");
            int code = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (code <= 0) {
                throw new InvalidEmpNumberException();
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.print("Enter Date of Joining (yyyy-mm-dd): ");
            LocalDate doj = LocalDate.parse(sc.nextLine());

            if (!dob.isBefore(doj)) {
                throw new InvalidDateOfJoinException();
            }

            Employee emp = new Employee(code, name, dob, doj);
            System.out.println("\nEmployee Details:");
            emp.display();

        } catch (InvalidEmpNumberException e) {
            System.out.println("Invalid Employee Code");
        } catch (InvalidDateOfJoinException e) {
            System.out.println("Invalid Date of Joining");
        } catch (Exception e) {
            System.out.println("Invalid Input Format");
        }
    }
}
