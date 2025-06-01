package oops;
import java.util.Scanner;

public class loop_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int tmp = num ;
		int rev = 0;
		while (num>0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;
	}
		if (rev == tmp) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
