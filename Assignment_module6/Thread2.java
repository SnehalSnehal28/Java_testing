package Assignment_module6;

public class Thread2 extends Thread {
	public void run() {
		System.out.println("Extending Thread is Running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2 = new Thread2();
		t2.start();

	}

}
