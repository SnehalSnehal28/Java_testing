package practice;
class p{
	protected int a;
	protected int b;
	void disp() {
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		
	}
	
}
class c extends p{
	void show() {
		System.out.println(a);
	}
}
class Protected_Specifire{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c1 = new c();
		c1.a=10;
		c1.b=20;
		System.out.println(c1.a);

	}
}


