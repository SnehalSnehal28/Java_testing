package map;
import java.util.*;

public class HashMapD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101,"Let us C");
		map.put(102,"Operating System");
		map.put(103,"Data Communication & Network");
		System.out.println("Value before remove:" + map);
		map.remove(102);
		System.out.println("Value after remove:" + map);
		
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Iterator enteries = map.entrySet().iterator();
		while(enteries.hasNext()) {
			Map.Entry entery = (Map.Entry) enteries.next();
		Integer key = (Integer)entery.getKey();
		String value = (String)entery.getValue();
		System.out.println("Key = " + key + ", Value = " + value);
		}
	}

}
