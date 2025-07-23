package Assignment_module6;

public class Sum_value_array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
		int sum =0;
		for (int i=0; i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of array is: " + sum);

	}

}
