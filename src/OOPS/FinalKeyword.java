package OOPS;
	//method overriding in final keyworrd
class Base{
	public final void display(String s) {
		System.out.println(s);
	}
	
}
class sample extends Base{
	public void display(String s) {
		System.out.println(s);
	}
}


public class FinalKeyword {
	public static void main(String[] args) {
		sample obj= new sample();
		obj.display("TRY");

	}


}
