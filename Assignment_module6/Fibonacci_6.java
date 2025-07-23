package Assignment_module6;
import java.util.Scanner;

public class Fibonacci_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Fibonacci Serise: ");
		System.out.print(a + " " + b + " ");
		for ( int  i=2;i<=10;i++) {
			c = a + b;
			System.out.print(" " + c + " ");
			a=b;
			b=c;
		}
		
}
}