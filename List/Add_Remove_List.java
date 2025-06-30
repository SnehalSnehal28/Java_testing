package List;
import java.util.*;

public class Add_Remove_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Snehal");
		al.add("Dharm");
		al.add("Aarohi");
		ArrayList<String> al2 =new ArrayList<String>();
		al2.add("Snehal");
		al2.add("Smit");
		//al.removeAll(al2);
		System.out.println("Iterating the elements after removing the element al2");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//use for each loop
		System.out.println();
		for(String str:al) {
			System.out.println(str);
		}
	}

}
