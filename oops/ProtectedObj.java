package oops;

class test2 {
	protected int x;
	private int y;
	
	
	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	void disp() {
		System.out.println("X " +x);
		System.out.println("Y "+ y);
	}
}
class test extends test2 {
	void show() {
		System.out.println(x);
	}
}

public class ProtectedObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj = new test2();
		obj.x=20;
		System.out.println(obj.x);
		obj.setY(30);
		System.out.println(obj.getY());        	
	}

}
