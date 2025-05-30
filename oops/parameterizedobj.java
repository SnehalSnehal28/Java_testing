package oops;
class Testing{ 
	int x;
	int y;
	String z;
	int k;
	
	Testing(){
		System.out.println("Constructor method ");
	}
	Testing(int a,int b){
		x=a;
		y=b;
		System.out.println(" Parameterized constructor method "+x);
		System.out.println(" Parameterized constructor method "+y);
	}
	Testing(String a,int b){
		z=a;
		k=b;
		System.out.println(" Parameterized charcter method "+z);
		System.out.println(" Parameterized character method "+k);
	}
	void disp() {
		System.out.println("X "+x);
		System.out.println("Y "+y);
		
	}
}

public class parameterizedobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t =new Testing(10,20);
		Testing t2=new Testing("Java",20);

	}

}
