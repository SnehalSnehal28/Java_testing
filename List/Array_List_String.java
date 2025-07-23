package List;
import java.util.*;

public class Array_List_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
		st.add("Nandu");
		st.add("Dhruvi");
		st.add("Reena");
		st.add("Divya");
		st.add("Divya");
		//Using Iterator
		Iterator itr=st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//using for each loop
		System.out.println();
		for(String obj:st) {
			System.out.println(obj);
		}
		
	}
}
