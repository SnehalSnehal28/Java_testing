package Assignment_module6;
import java.util.Scanner;

public class Prime_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
		}

	}


