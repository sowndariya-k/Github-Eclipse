package inheritance;
class base{
	int i;
	void display() {
		System.out.println(i);
	}
}
class derived extends base{
	int j;
	void display() {
		System.out.println(j);
	}
}
public class demo {
	public static void main(String[] args) {
		derived obj=new derived();
		obj.i=5;
		obj.display();
		obj.j=10;
	}

}
