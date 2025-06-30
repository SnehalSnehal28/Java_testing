package Assignment_module6;
import java.util.Scanner;

public class Gratest_number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Third Number: ");
		int num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Gretest number is: " + num1);
		}
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Gretest number is: " + num2);
		}
		else {
			System.out.println("Gretest number is: " + num3);
		}	
	}
}
