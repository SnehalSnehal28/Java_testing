package oops;
 import java.util.Scanner;

public class user_pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String correctusername = "Snehal";
		String correctpassword = "12345";
		
		System.out.println("Enter Username: ");
		String username = sc.next();
		
		System.out.println("Enter Password: ");
		String password = sc.next();
		if (correctusername.equals(username) && (correctpassword.equals(password))) {
			System.out.println("You are successfully Login");
		}
		else 
		{
			System.out.println("Incorrect Password");
			
		}
	}
		}

