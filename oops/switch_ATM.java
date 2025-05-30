package oops;
import java.util.Scanner;

public class switch_ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Acoount Inquiry");
		System.out.println("2.Cash Withdrawl");
		System.out.println("3.Cash Deposite");
		System.out.println("Select 1-3 Menu");
		int balance = 50000;
		int atm = sc.nextInt();
		switch(atm) {
		case 1:
			System.out.println("Your current balance is: " + balance);
			break;
		case 2:
			System.out.println("Enter amount for withdrowl");
			int wd = sc.nextInt();
			if (wd <= balance) {
				balance = balance - wd;
				System.out.println("Amount withdrawl Rs. "+wd);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
			break;
		case 3:
			System.out.println("Enter amount to deposite");
			int dp = sc.nextInt();
			balance = balance + dp;
			System.out.println("Money Deposite Rs." + dp);
			break;
		default:
			System.out.println("Wrong Choice ");
			}
		System.out.println("Your final balance is Rs. "+balance);
		

	}

}
