package practice;

public class Multi_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][] = {
				{70,60},
				{90,80}
		};
		
		for(int i=0; i<2; i++) {
			System.out.println("Student " + (i + 1) + " Marks ");
		for(int j=0; j<2; j++) {
			System.out.println(("     Subject " + (j + 1) + ":" ) + marks[i][j]);
		}
		}
	}
}
