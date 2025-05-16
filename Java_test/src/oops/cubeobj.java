package oops;

class cube {
	int num1;
	void disp (int a) {
		System.out.println(" Cube is "+ (a*a*a));
	}
 
}
public class cubeobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube obj = new cube();
		obj.disp(2);
		
	}

}
