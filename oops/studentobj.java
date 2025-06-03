package oops;
class student{
	int a;
	String b;
	String c;
	student(int rollno, String name,String course) {
		a=rollno;
		b=name;
		c=course;
		System.out.println(" Roll no : " + a);
		System.out.println(" Name: " + b);
		System.out.println(" Course : " + c);
		
		}
}

public class studentobj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st1 = new student(1,"snehal","Software Testing");
		student st2 = new student(2,"Reena","Nursing");
		

	}

}
