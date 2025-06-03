package practice;
import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :");
		char grade = sc.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Below Average");
			break;
		case 'E':
			System.out.println("Fail");
			break;
			default:
				System.out.println("Invalid");
				
			
			
		}
		

	}

}
