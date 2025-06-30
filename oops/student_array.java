package oops;
class students{
	private int roll_no;
	private String name;
	private String course;
	students(){
	}
	public int getA() {
		return roll_no;
	}

	public void setA(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getB() {
		return name;
	}

	public void setB(String name) {
		this.name = name;
	}

	public String getC() {
		return course;
	}

	public void setC(String course) {
		this.course = course;
		
	}		
	
	}
public class student_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students[] s= new students[3];
		for (int i=0;i<3;i++) {
			s[i] = new students();
		}
		System.out.println("Student Details :");
		s[0].setA(101);
		s[0].setB("Snehal");
		s[0].setC("QA");
		
		s[1].setA(102);
		s[1].setB("Reena");
		s[1].setC("PHP");
		
		s[2].setA(103);
		s[2].setB("Dhruvi");
		s[2].setC("Python");
		
		for(int i=0;i<3;i++) {
			
			
		System.out.println("Roll no is: " + s[i].getA());
		System.out.println("Name is: " + s[i].getB());
		System.out.println("Course is: " + s[i].getC());
		System.out.println();
		
		}
	}

}
