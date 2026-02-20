package HandsOn_ControlFlow;

public class Alphabets {

	public static void main(String[] args) {
		for(int i=0; i<26;i++) {
			char first;
			char second;
			
			if(i<13) {//first half az to mn
				first=(char) ('a'+i);
				second=(char)('z'-i);
			}
			else {//second half za to nm
				first=(char)('z'-(i-13));
				second=(char)('a'+(i-13));
			}
			System.out.print("" +first +second + " ");
		}

	}

}
