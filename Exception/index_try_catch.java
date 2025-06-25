package Exception;

public class index_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [5];
		try {
			arr [5]=10;
			System.out.println("Hello ");
		}catch (ArithmeticException e) {
			System.out.println("Error "+e);
		}
		catch(Exception e) {
			System.out.println("Error "+ e);
		}
		System.out.println("Rest of the code");

	}

}
