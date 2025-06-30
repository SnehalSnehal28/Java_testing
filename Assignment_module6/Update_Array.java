package Assignment_module6;
import java.util.*;

public class Update_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
		st.add("Red");
		st.add("Yellow");
		st.add("Pink");
		System.out.println("Before Update: " + st);
		
		st.set(1, "Orange");
		System.out.println("After Update: " + st);

	}

}
