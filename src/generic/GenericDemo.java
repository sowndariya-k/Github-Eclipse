package generic;

/*Parameter
 * T-type, K-key, N-number, S, U,V-2nd , 3rd, 4th types, V-value, 
 */
class Demo <T>{
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class GenericDemo {

	public static void main(String[] args) {
		Demo <Integer> obj=new Demo<Integer>();
		
		obj.setT(20);
		System.out.println(obj.getT());
		
		Demo <String> sobj=new Demo<String>();
		sobj.setT("Demo");
		System.out.println(sobj.getT());
		

	}

}
