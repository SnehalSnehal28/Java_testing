package oops;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount ");
        int amt = sc.nextInt();

        System.out.println("500: " + amt/500);
        amt = amt % 500;
        
        System.out.println("200: " + amt/200);
        amt = amt % 200;
        
        System.out.println("100: " + amt/100);
        amt = amt % 100;
        
        System.out.println("50: " + amt/50);
        amt = amt % 50;
        
        System.out.println("20: " + amt/20);
        amt = amt % 20;
        	
        System.out.println("10: " + amt/10);
        amt = amt % 10;
    }
}
