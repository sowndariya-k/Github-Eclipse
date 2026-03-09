package New;
import java.util.*;
public class Main {

			public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Enter name:");
				String name = input.nextLine();
				System.out.println(name);
				System.out.println("enter the age:");
				int age=input.nextInt();
				System.out.println(age);
				if(age>18) {
					System.out.println("you are eligible.");
				}
				else {
					System.out.println("you are not eligible.");
				}
			}
	}
