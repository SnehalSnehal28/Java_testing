
package oops;
class Sort {
	void sortClass(int a[]) {
		System.out.println("Sort value is: ");
		int tmp;
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
			if(a[i] > a[j]) {
				//swap
				tmp= a[i];
				a[i] = a[j];
				a[j] = tmp;
			}			
		}	
		}
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i] + " ");
	}
		}
	}
public class function_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,2,20,10,50};
		Sort obj = new Sort();
		obj.sortClass(a);
	}

}

