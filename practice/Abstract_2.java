package practice;
abstract class shape{
	abstract void area();
}

class circle extends shape{
	int r;
	circle(int r){
		this.r = r;
		
	}
	void area() {
		double res = 3.14 * r *r;
		System.out.println("Circle is: " + res);
	}
	
}
class Ract extends shape{
	int l,b;
	Ract (int l,int b){
		this.l=l;
		this.b=b;
		
	}
	void area () {
		double res = l*b;
		System.out.println("Ractangle is: " + res);
	}
	
}
public class Abstract_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle(4);
		c.area();
		Ract r = new Ract(10,20);
		r.area();
		
	   
	}

}
