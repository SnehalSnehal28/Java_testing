package oops;
class std{
	int roll_no;
	String name;
	std(int roll_no,String name){
		this.roll_no = roll_no;
		this.name=name;
		}
	@Override
	public String toString() {
		return "std [roll_no=" + roll_no + ", name=" + name + "]";
	}
	
	
}

public class object_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std s1= new std(1,"rushi");
		System.out.println(s1);
		std s2= new std(2,"Ridhi");
		System.out.println(s2);

	}

}
