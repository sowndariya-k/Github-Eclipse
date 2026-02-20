package TypeConversion;
import java.util.*;
public class ReadSampleInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your Name: ");//Arun Kumar
		String name=sc.next();
		System.out.println("Hi "+name+" ,Welcome to the Training Program...");//Hi Arun ,Welcome to the Training Program...
		sc.nextLine();// this is important for enter next input . if it is missed, it takes the above balance word after the space in name.
		System.out.print("Enter your Name2: ");//Sowndariya K
		String name2=sc.nextLine();
		System.out.println("Hi "+name2+" ,Welcome to the Training Program...");//Hi Sowndariya K ,Welcome to the Training Program...
		sc.close();
	}

}
