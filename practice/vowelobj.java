package practice;
import java.util.Scanner;

public class vowelobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Latter");
		char latter = sc.next().toLowerCase().charAt(0);
		
		switch (latter) {
		case 'a':
			System.out.println("It is a vowel");
			break;
		case 'e':
			System.out.println("It is a vowel");
			break;
		case 'i':
			System.out.println("It is a vowel");
			break;
		case 'o':
			System.out.println("It is a vowel");
			break;
		case 'u':
			System.out.println("It is a vowel");
			break;
			default:
				System.out.println("It is a consonant");
				
		}

	}

}
