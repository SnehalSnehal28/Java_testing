package map;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int qty;
	 Book(int id,String name,String author,String publisher,int qty){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}

public class HashMapD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> map=new HashMap<Integer,Book>();
		Book b1 = new Book(1,"C","Yashvant","BPB",5);
		Book b2 = new Book(2,"C++","Balguru","Hill education",10);
		Book b3 = new Book(3,"Php","Laura Thomson","Addison-Wesley",2);
		//adding book list
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		
		for(Map.Entry<Integer,Book> entry:map.entrySet()) {
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qty);
		}	
		}
}

