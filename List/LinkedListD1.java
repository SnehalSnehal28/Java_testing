package List;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> st = new LinkedList<String>();
		st.add("Riddhi");
		st.add("Jiya");
		st.add("Tanvi");
		st.add("Jiya");
		
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//use for each
		System.out.println();
		for(String str:st) {
			System.out.println(str);
		}

	}

}
