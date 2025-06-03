package oops;

public class amstrong_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 1000) {
			int num = i;
			int tmp = num;
			int sum = 0;
			
			while (tmp > 0) {
				int digit = tmp % 10;
				sum = sum + (digit * digit * digit);
				tmp = tmp /10;
			}
			if (sum == num) {
				System.out.println(num + " is amstrong numbers");
			}
			i++;
		}

	}

}
