package oops;

public class loop_hello_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "HELLO";
		for (int  i = word.length(); i >= 1;i--) {
			System.out.println(word.substring(0,i));
		
		}
	}

}
