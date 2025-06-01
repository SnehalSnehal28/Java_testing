package oops;
import java.util.Scanner;

public class loop_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int rev =0;
		 while (num>0) {
			 int tmp = num % 10;
			 rev = rev * 10 + tmp;
			 num = num/10;
		 }
		 System.out.println("Reverse number is :" + rev);

	}

}
