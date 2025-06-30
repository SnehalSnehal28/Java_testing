package Assignment_module6;

public class find_index_array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10,20,30,40,50};
		int index = 10;
		for (int i=0; i<a.length; i++) {
			if (a[i] == index) {
				System.out.println(index + " is at index " + i);
			}
		}

	}

}
