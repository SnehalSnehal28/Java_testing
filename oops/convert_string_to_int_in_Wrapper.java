package oops;

public class convert_string_to_int_in_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "20";
		int num = Integer.parseInt(str);
		System.out.println(num*2);
		
		//convert  int to integer
		
		int a = 20;
		Integer i = Integer.valueOf(a);
		Integer j =a;
		System.out.println(a + " " + " " + j);

	}

}
