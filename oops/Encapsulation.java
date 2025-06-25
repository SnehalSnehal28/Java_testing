package oops;
class enc{
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enc t = new enc();
		t.setA(10);
		System.out.println("A value is :" + t.getA());
		t.setB(20);
		System.out.println("B value is :" + t.getB());
		
		
	}

}
