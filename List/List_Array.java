package List;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class List_Array {
	public static void main(String[] args) {
		List<Integer> ls =new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(10);
		
		System.out.println(ls);
		Iterator itr =ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
