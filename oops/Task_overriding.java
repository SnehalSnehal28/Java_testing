package oops;
class payment{
	void makePayment() {
		System.out.println("Making a generic payment");
	}
}
class UPI extends payment{
	void makePayment() {
		System.out.println("Make a payment using UPI");
	}
}
class Cradit_card extends payment{
	void makePayment() {
		System.out.println("Make a payment using Cradit Card");
	}
}
class Wallet extends payment{
	void makePayment() {
		System.out.println("Make a payment using Wallet");
	}
}
public class Task_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPI upi=new UPI();
		upi.makePayment();
		Cradit_card cradit=new Cradit_card();
		cradit.makePayment();
		Wallet w=new Wallet();
		w.makePayment();
	}

}
