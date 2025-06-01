package oops;
import java.util.Scanner;

public class loop_Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum = 0;
		int tmp = num;
		while (num>0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num/10;
	}
		if (sum == tmp) {
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
	}

}
