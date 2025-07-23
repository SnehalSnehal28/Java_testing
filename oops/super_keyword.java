package oops;
class p{
	p() {
		System.out.println("I am Default parent");
	}
	p(int a){
		System.out.println("I am Parameter parent");
	}
}
class c extends p{
	c(){
		System.out.println("I am Default child");
	}
	c(int a){
	super (a);{
		System.out.println("I am Parameter child ");
	}
}
}
public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj = new c(10);
	}
}
