package practice;
import java.util.Scanner;

public class basic_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter operator (+,-,*,/): ");
		char op= sc.next().charAt(0);
		
		switch (op) {
		case '+':
			System.out.println("Sum :" + (a+b));
			break;
		case '-':
			System.out.println("Sub :" + (a-b));
			break;
		case '*':
			System.out.println("Mul :" + (a*b));
			break;
		case '/':
			System.out.println("Div :" + (a/b));
			break;
		default:
			System.out.println("Wrong");
		}
		}
}
