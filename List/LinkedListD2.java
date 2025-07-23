package List;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int qty;
	Book(int id,String name,String authot,String publisher,int qty){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}

public class LinkedListD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list =new LinkedList<Book>();
		Book b1 = new Book(1,"C","Yashvant","BPB",5);
		Book b2 = new Book(2,"C++","Balguru","Hill education",10);
		Book b3 = new Book(3,"Php","Laura Thomson","Addison-Wesley",2);
		//adding book list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qty);
		}	
		}
}
