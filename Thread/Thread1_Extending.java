package Thread;

class Thread1_Extending extends Thread{
	public void run() {
		System.out.println("Thread is running.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1_Extending t1 = new Thread1_Extending();
		t1.start();

	}

}
