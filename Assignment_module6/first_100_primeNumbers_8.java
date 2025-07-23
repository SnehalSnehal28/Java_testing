package Assignment_module6;

public class first_100_primeNumbers_8 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("1 to 100 Prime Number is: ");
		for(int num=2;num<=100;num++) {
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(num + " ");
				sum = sum + num;
			}
		}
		System.out.println();
		System.out.println("Sum of Prime number is: " + sum);
	}
}
