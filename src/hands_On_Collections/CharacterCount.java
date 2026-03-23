package hands_On_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String text=input.nextLine();
		text=text.toLowerCase();
		char[] targets= {'a','c','o','s'};
		//hashmap
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:targets) {
			map.put(ch,0);
		}
		for(char ch:text.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
		}
		 // Print results
        System.out.println("Character counts:");
        for (char ch : targets) {
            System.out.println(ch + ": " + map.get(ch));
        }

	}

}
