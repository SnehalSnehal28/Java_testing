package Assignment_module6;
abstract class parent {
	abstract void message() ;
}
class sub1 extends parent {
	void message() {
		System.out.println("I am sub1 class");
	}
	
}
class sub2 extends parent {
	void message() {
		System.out.println("I am sub2 class");
	}
	
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 a = new sub1();
		a.message();
		sub2 b = new sub2();
		b.message();

	}

}
