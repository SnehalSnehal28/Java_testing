package oops;

public class while_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int sum = 0;
		 while (num>0) {
			 int tmp =num%10;
			 sum = sum + tmp;
			 num = num/10;
			 
		 }
         System.out.println("Sum of digits : " + sum);
	}

}

