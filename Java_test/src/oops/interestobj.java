package oops;
class interest {
	int p;
	int r;
	int n;
	void init_data(int p1,int r1,int n1) {
		int res=(p1*r1*n1)/100;
		System.out.println( " Simple interest is : "+ res);
	}
}

public class interestobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interest obj = new interest ();
		obj.init_data(1000, 4, 2);


	}

}
