package Basic;

class Calc1 {
	int num1;
	int num2;
	void init_data(int a, int b) {
		num1=a;
		num2=b;
	}
	void add() {
		System.out.println("Addition is "+ (num1+num2));
	}
	void sub() {
		System.out.println("Subtraction is "+(num1-num2));
	}
	void mul() {
		System.out.println("Multiplication is "+(num1*num2));
	}
	void div() {
		System.out.println("Division is "+ (num1/num2));
	}
}
	

 public class MyFirst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 obj = new Calc1();
		obj.init_data(20,10);
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
}
}
