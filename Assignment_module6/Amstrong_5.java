package Assignment_module6;
import java.util.Scanner;

public class Amstrong_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int tmp = num ;
		int sum =0;
		while(num>0) {
			int digit = num%10;
			sum = sum + (digit * digit * digit);
			num = num/10;
		}
       if(sum == tmp) {
    	   System.out.println("Amstrong Number");
       }
       else
       {
    	   System.out.println("Not Amstrong Number121");
       }
	}

}
