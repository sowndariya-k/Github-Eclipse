package HandsOn_Array;
import java.util.*;
public class DiceFrequency {

	public static void main(String[] args) {
		Random rand= new Random();
		
		int[] freq=new int[6];//0-5 index ->value 1-6
		
		//roll 100 times
		for(int i=0; i<100; i++) {
			int roll= rand.nextInt(6)+ 1;//1-6 generate random value +1 indicates for dice value
			freq[roll-1]++;//-1 is used for get array index
		}
		
		//display frequency
		for(int i=0; i<6;i++) {
			System.out.println("Number "+(i+1)+": "+freq[i]);
		}
	}

}
