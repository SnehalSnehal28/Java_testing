package set;
import java.util.*;

public class LinkedHashSetD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("Java");
		set.add("Php");
		set.add("Java");
		set.add("C++");
		set.add("JavaScript");
		
		Iterator itr =set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		set.remove("Java");
		System.out.println("After removing the Java: ");
		for(String s:set) {
			System.out.println(s);
		}

	}

}
