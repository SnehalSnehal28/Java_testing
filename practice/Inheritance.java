package practice;
class calc{
	void add(int a, int b) {
		System.out.println("Addition is: " + (a+b));
	}
}
class sci extends calc{
	void sqr(int a) {
		System.out.println("Sqaure is: " + (a*a));
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sci s= new sci();
		s.add(10,20);
		s.sqr(10);

	}

}
