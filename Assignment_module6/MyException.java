package Assignment_module6;

class MyException extends Exception {
		MyException (String message){
			super(message);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acBalance = 2000;
		int withdrawAmount = 500;
		try {
			if (withdrawAmount > acBalance) {
				int store = withdrawAmount - acBalance;
				throw new MyException ("Sorry, insufficient balance you need more " + store + "Rs. to perform this transaction");
			}
			else {
				acBalance -= withdrawAmount;
				System.out.println("Withdraw successful. Remaining balance: " +acBalance);
		}

	}catch (MyException e) {
		System.out.println(e.getMessage());
	}

}
	}
