package oops;
import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("1. C language");
		System.out.println("2. C++ language");
		System.out.println("3. Java language");
		System.out.println("Select Menu");
		int subjectno = sc.nextInt();
		switch(subjectno) {
		case 1:
			System.out.println("You are select in C language");
			break;
		case 2:
			System.out.println("You are select in C++ language");
			break;
		case 3:
			System.out.println("You are select in java language");
			break;
		default:
			System.out.println("Get lost");
		
		}
		
	}

}
