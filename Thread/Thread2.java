package Thread;

class Thread2 implements Runnable {
	public void run() {
		System.out.println("Thread is Running.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 m1 = new Thread2();
		Thread t1 = new Thread(m1);
		t1.start();

	}

}
