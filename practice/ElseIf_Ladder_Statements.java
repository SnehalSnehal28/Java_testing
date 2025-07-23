package practice;
import java.util.Scanner;
public class ElseIf_Ladder_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		if(marks > 1 && marks <= 40) {
			System.out.println("Fail");
		}
		else if (marks > 40 && marks < 60) {
			System.out.println("Grade is C");
		}
		else if (marks > 60 && marks < 85) {
			System.out.println("Grade is B");
		}
		else if (marks > 85 && marks <= 100){
			System.out.println("Grade A");
		}
		else {
			System.out.println("Invalid choice");
		}

	}

}
