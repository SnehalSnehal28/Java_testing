package Assignment_module6;

public class Reverese_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		int b[] = new int[5];
		
		System.out.println("Original Array is: ");
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Reverse Array is: ");
		for (int i = 4; i>=0 ; i--) {
			System.out.println(a[i] + " ");
		}

	}

}
