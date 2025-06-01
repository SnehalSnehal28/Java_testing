package oops;
import java.util.Scanner;

public class do_while_ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		double balance = 50000;
		do {
			System.out.println("ATM Menu");
			System.out.println("1.Account Inquiry");
			System.out.println("2.Cash Withdrawl");
			System.out.println("3.Cash Deposite");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Your current balance is : " + balance);
				break;
			case 2:
				System.out.println("Enter amount you want to withdrawl Rs.");
				double wd = sc.nextDouble();
				if(wd <= balance) {
					balance -= wd;
					System.out.println("Withdrawl successfully. Remaining balance is : " + balance);
				}
				else
				{
					System.out.println("Insufficient balance");
				}
				break;
			case 3:
				System.out.println("Enter amount you want to deposite Rs.");
				double dp = sc.nextDouble();
				balance += dp;
				System.out.println("Deposite successfully. Now balance is : " + balance);
				break;
			case 4:
				System.out.println("Invalid choice please try again");
			}
		}
		while (ch != 4);
	}

}
