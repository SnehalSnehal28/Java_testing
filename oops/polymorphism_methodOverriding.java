package oops;
class RBI {
	void rateOfInt() {
		System.out.println("RBI create this method ");
	}
	
}
class SBI extends RBI{
	void rateOfInt() {
		System.out.println("SBI gave 5% ");
	}
	
}
class PNB extends SBI{
	void rateOfInt() {
		System.out.println("PNB gave 7%" );
	}
	
}

public class polymorphism_methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PNB pnb = new PNB();
		pnb.rateOfInt();
		SBI sbi = new SBI();
		sbi.rateOfInt();

	}

}
