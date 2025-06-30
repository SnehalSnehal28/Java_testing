package oops;
class TestFinalize{
	public void finalize() {
		System.out.println("Finalize Method");
	}
}

public class Finalize_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinalize f = new TestFinalize();
		f=null;
		System.gc();
		System.out.println("End ");

	}

}
