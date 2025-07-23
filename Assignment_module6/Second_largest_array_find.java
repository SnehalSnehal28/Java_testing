package Assignment_module6;

public class Second_largest_array_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {45,22,89,75,12};
		int largest = arr[0];
		int second = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			
		}
		for (int i=0;i<arr.length;i++) {
			if(arr[i] > second && arr[i] < largest) {
				second = arr[i];
			}
		}
		System.out.println("Second Largest Number is: "+ second);

	}

}
