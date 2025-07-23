package practice;
class RBI{
	void RateOfInt() {
		System.out.println("RBI creates a method");
	}
}
class IND extends RBI{
	void RateOfInt() {
		System.out.println("IND give 5% ");
	}
}
class PNB extends RBI{
	void RateOfInt() {
		System.out.println("PNB give 7%");
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PNB p = new PNB();
		p.RateOfInt();
		IND i = new IND();
		i.RateOfInt();

	}

}
