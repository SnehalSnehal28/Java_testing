package practice;
class enc{
	private int a;
	private int b;
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
		enc e = new enc();
		e.setA(10);
		System.out.println("A value is: " + e.getA());
		e.setB(20);
		System.out.println("B value is: " + e.getB());
	}

}
