package oops;
import java.util.Scanner;

public class array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		for (int j=0; j<5; j++) {
			System.out.println(" Enter number " + j);
			a[j]= sc.nextInt();
			}
		int max = a[0];
		for (int i=1; i<5; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
			System.out.println("Max number is " + max);
		}
		}
	


