package practice;
class F1 {
	void car() {
		System.out.println("Fathers Car");
	}
}
class son extends F1{
	void bike() {
		System.out.println("Sons Bike");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s = new son();
		s.car();
		s.bike();

	}

}
