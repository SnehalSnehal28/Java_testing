package List;
import java.util.*;

public class Object_Student {
		int roll_no;
		String name;
		int age;

		Object_Student(int roll_no,String name,int age){
			this.roll_no=roll_no;
			this.name=name;
			this.age=age;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_Student s1 = new Object_Student(101,"Dhruvi",20);
		Object_Student s2 = new Object_Student(102,"Divya",21);
		Object_Student s3 = new Object_Student(103,"Reena",22);
		
		ArrayList<Object_Student> al = new ArrayList<Object_Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		//Using Iterator
		Iterator itr =al.iterator();
		while (itr.hasNext()) {
			Object_Student st=(Object_Student)itr.next();
			System.out.println(st.roll_no+" "+st.name+" "+st.age);
		}
		System.out.println("=================");
		//using for each loop
		for(Object_Student s:al) {
			System.out.println(s.roll_no+" "+s.name+" "+s.age);
		}
		
		
			}
		

	}


