package Assignment_module6;
import java.util.*;

public class Array_listD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
		st.add("Apple");
		st.add("Banana");
		st.add("Mango");
		st.add("Orange");
		
		//Using while
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Using for each loop
		System.out.println("--------------");
		for(String s:st) {
			System.out.println(s);
		}
		

	}

}
