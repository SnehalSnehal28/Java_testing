package oops;
class animal{
	void sound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends animal{
	void sound() {
		System.out.println("Dog Barks");
	}
	void show () {
		super.sound();
	}
}
public class Task_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.show();
		
	}

}
