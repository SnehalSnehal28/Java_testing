package Assignment_module6;

public class Try_Catch_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			int b= 0;
			int res = a/b;
			System.out.println("Result is: " +res);
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Rest of code...");

	}

}
