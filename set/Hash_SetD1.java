package set;
import java.util.*;
public class Hash_SetD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<>();
		set.add("Ravi");
		set.add("Reena");
		set.add("janvi");
		set.add("Ravi");
		set.add("xyz");
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
