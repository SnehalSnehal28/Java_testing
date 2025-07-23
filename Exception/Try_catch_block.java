package Exception;
public class Try_catch_block {

		public static void main(String[] args) {
			try {
				int data = 50/0;
				System.out.println("Hello " + data);
			}catch(ArithmeticException e) {
				System.out.println("Error: " + e);
			}
			System.out.println("Rest of code...");	
			}
		}

	