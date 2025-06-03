package oops;
class test1{
	private int x;
	private int  y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

 void disp() {
	 System.out.println("X:"+x);
	 System.out.println("Y:"+y);
 }
}

public class privateobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj = new test1();
		obj.setX(10);
		obj.setY(20);
		obj.disp();
		System.out.println("X value :"+obj.getX());
		System.out.println("Y value :"+obj.getY());

	}

}
