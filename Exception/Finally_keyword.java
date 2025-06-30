package Exception;

public class Finally_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=25/0;
			System.out.println("Data" + data);
		}catch(ArithmeticException e) {
			System.out.println("Java" + e);
		}
		finally {
			System.out.println("Finally block is always excute");
		}
		System.out.println("Rest of code");

	}

}
