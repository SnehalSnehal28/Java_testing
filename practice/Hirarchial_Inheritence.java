package practice;
class Father1 {
	void car() {
		System.out.println("Fathers car");
	}
}
class Son1 extends Father1{
	void bike() {
		System.out.println("Sons bike");
	}
}
class Daughter extends Father1{
	void scooty() {
		System.out.println("Daughters Scooty");
	}
}

public class Hirarchial_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		d.car();
		d.scooty();
		Son1 s = new Son1();
		s.car();
		s.bike();
		

	}

}
