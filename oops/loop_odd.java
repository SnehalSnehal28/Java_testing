package oops;

public class loop_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of odd numbers :" + sum);

	}

}
