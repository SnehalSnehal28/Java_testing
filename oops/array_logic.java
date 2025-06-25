package oops;

public class array_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		for (int i=0; i < 3; i++){
			for (int j=0; j < 3; j++) {
				if (i == j) {
					 System.out.print(a[i][j] + " ");
			}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}