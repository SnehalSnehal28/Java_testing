package oops;

class parent{
	protected void greet() {
		System.out.println("I am parent");
	}
}
class ProtectedExm extends parent{
	protected void greet() {
		System.out.println("I am Child");
	}
public static void main(String[] args) {
	parent p = new parent();
	p.greet();
	ProtectedExm obj = new ProtectedExm();
	obj.greet();
	
}
}