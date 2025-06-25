package practice;
abstract class animal{
	abstract void makeSound();
}
class cat extends animal{
	void makeSound() {
		System.out.println("Meoo..meooo");
	}
}
class dog extends animal {
	void makeSound() {
		System.out.println("Bark...");
	}
}

public class abstract_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c= new cat();
		c.makeSound();
		dog d = new dog();
		d.makeSound();

	}

}
