package oops;
class customer {
	String name;
	int cust_id;
	static int ri =3;
	customer(String name,int cust_id){
		this.name=name;
		this.cust_id = cust_id;
	}
	void disp() {
		System.out.println("Name: " + name + " Customer Id: " + cust_id + " Rate of Interest: " +ri);
	}
	static void change(int a) {
		ri = a;
	}
}

public class static_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		customer c1 = new customer("Snehal" , 101);
		c1.disp();
		customer c2 = new customer("Reena" , 102);
		c2.disp();
		c2.change(5);
		customer c3 = new customer("Dhruvi" , 103);
		c3.disp();
	}

}
