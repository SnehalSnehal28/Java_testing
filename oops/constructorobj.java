package oops;
class Test{
	int a;
	Test(){
		System.out.println(" Constructor Method ");
		a=10;
	}
	void disp () {
		System.out.println(" Disp function invoked "+a);
	}
}

public class constructorobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.disp();

	}

}
