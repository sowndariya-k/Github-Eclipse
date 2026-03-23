package hands_On_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StudentStackExample {
	 public static Stack<String> pushToStack(Map<String, Integer> map) {
	        Stack<String> stack = new Stack<>();

	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 75) {
	                stack.push(entry.getKey());
	            }
	        }

	        return stack;
	    }
	 
	 // Function to pop and display stack contents
	    public static void popAndDisplay(Stack<String> stack) {
	        System.out.println("Student Marks above 75 in the stack:");

	        while (!stack.isEmpty()) {
	            System.out.println(stack.pop());
	        }
	    }

	public static void main(String[] args) {
		Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Mano", 85);
        studentMarks.put("Shan", 85);
        studentMarks.put("John", 55);
        studentMarks.put("Anu", 60);
        studentMarks.put("Aju", 90);
        studentMarks.put("Frank", 80);

        // Display input
        System.out.println("Student Marks in the HashMap: " + studentMarks);

        // Push to stack
        Stack<String> stack = pushToStack(studentMarks);

        // Pop and display
        popAndDisplay(stack);

	}

}
