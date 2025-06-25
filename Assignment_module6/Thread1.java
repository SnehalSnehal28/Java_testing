package Assignment_module6;
class Thread1 implements Runnable {
	public void run() {
		System.out.println("Runnable Thread is Running......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread m1 = new Thread(t1);
		m1.start();

	}

}
