package oops;
import java.util.Scanner;

public class odd_even_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for (int j=0;j<5;j++) { // for index
			System.out.println("Enter number "+j);
			a[j]=sc.nextInt();
		}
		System.out.println("Even Numbers :");
		for (int i=0;i<5;i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);	
			}
		}
		System.out.println("Odd numbers :");
		for (int i=0; i<5; i++) {
			if(a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}

	}

}
