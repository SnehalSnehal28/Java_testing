package Assignment_module6;

public class max_min_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10,5,20,50,1};
		int max = a[0];
		int min = a[0];
		
		for (int i=0; i<a.length;i++) {
			if (a[i] > max) {
				max = a[i];	
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum value is: " + max);
		System.out.println("Minimum value is: " + min);
	}
}
