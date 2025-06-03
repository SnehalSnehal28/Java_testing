package oops;
import java.util.Scanner;

public class loop_basic_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int j=0; j<5; j++) { // for index
			System.out.println("Enter number: "+j);
			a[j] = sc.nextInt();
		}
		for (int i=0;i<5; i++) {
			System.out.println(a[i]);
		}
		

	}

}
