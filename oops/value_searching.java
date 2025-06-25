package oops;
class value {
	int val = 40;
	void searchVal (int a[]) {
		for(int i=0;i<5;i++) {
		System.out.println(a[i]);
		if (a[i]==val) {
		System.out.println("Match");
		break;
		}
		else {
				System.out.println("Not match");
			 }
	   } 
	 }
 }
public class value_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		
		value obj = new value();
		obj.searchVal(a);	
	}
	}


