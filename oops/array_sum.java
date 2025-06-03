package oops;
import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a[] = new int[5];
		for (int j=0; j<5; j++) {   //for index
			System.out.println("Enter number :");
		    a[j] = sc.nextInt();
		    }
		for (int i=0;i<5;i++) {
			sum= sum + a[i];
			
		}
		System.out.println("Sum of array elemnets :" + sum);

	}

}
