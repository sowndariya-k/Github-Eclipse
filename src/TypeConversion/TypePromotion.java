package TypeConversion;

public class TypePromotion {

	public static void main(String[] args) {
		byte b=2;//50
		b=(byte)(b*2);//promote into int
		System.out.println(b);//100
		/*double into byte*/
		/*b=(byte)(b*2.0);
		System.out.println(b);// upto -127 to 128  //-56*/
	}
}
