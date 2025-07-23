package practice;
class parameter{
	int a;
	String b;
	parameter(int a,String b){
		System.out.println("Roll No: " + a);
		System.out.println("Name: " + b);
	}
}

public class ParametrizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter p = new parameter(1,"Snehal");
		

	}

}
