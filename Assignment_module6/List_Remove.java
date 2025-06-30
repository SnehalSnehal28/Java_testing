package Assignment_module6;
import java.util.*;

public class List_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
		st.add("Cow");
		st.add("Buffalo");
		st.add("Dog");
		st.add("Sparrow");
		System.out.println("Before remove" + st);
		
		st.remove(3);
		System.out.println("After Remove" + st);

	}

}
