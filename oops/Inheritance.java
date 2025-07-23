package oops;
class clc{
	void add (int a,int b) {
		System.out.println("Addition is :" + (a+b));
	}
}
class sci extends clc{
	void squre (int a) {
		System.out.println("Squre is :" + (a*a));
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sci s= new sci();
		s.add(10,20);
		s.squre(5);
	}

}
