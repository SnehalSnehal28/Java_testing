package practice;
class Grandfather{
	void gf() {
		System.out.println("Grandfathers house");
	}
}
class Father extends Grandfather{
	void f() {
		System.out.println("Fathers house");
	}
}
class Son extends Father{
	void s() {
		System.out.println("Sons house");
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj = new Son();
		obj.s();
		obj.f();
		obj.gf();

	}

}
