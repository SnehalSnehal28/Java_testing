package practice;
class add {
	int a;
	int b;
	void res (int a1,int b1) {
		a=a1;
		b=b1;
		System.out.println("addition :"+(a+b));
	}
}

public class addobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj = new add ();
		obj.res(2,4);

	}

}
