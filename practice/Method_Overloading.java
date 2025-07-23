package practice;
class clc{
	void add(int a,int b) {
		System.out.println("Addition is: " + (a+b));
	}
}
class clc1 extends clc{
	void add(int a) {
		System.out.println("Squre is: " + (a*a));
		
	}
}
public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clc1 c1=new clc1();
		c1.add(10);
		c1.add(10, 20);

	}

}
