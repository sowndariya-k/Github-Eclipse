package HandsOn_fileSystem;

import java.util.*;
/*
 * Bounded type- restricted (upperBound-wildcard)
 */
public class WildCard {

	public static void main(String[] args) {
		List<Integer> ints=new ArrayList<>();
		ints.add(3);
		ints.add(13);
		ints.add(32);
		double sum=sum(ints);
		System.out.println("Sum of ints= "+sum);
	}
	public static double sum(List<?extends Number>list) {
		double sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}

}
