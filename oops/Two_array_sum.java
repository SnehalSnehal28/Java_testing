package oops;

public class Two_array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		int c[]= new int[5];
		for (int i=0;i<5;i++) {
			
		c[i]=a[i] + a[i];
		System.out.print(c[i] + " ");
		}				
	}		
}
