package oops;

public class string_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String a[]= {"Rajesh","Sunil","Rohit"};
		String st = "Rohit";
		for (int i=0;i<a.length;i++) {
			if (a[i].equals(st)) {
			System.out.println("Match");
			break;
			
		}
			else
			{
				System.out.println("Not match");
			}
	}
	}
}
