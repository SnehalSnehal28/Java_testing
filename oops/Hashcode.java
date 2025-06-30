package oops;
class hash{
	int roll_no;
	String name;
	hash(int roll_no,String name){
		this.roll_no = roll_no;
		this.name=name;
}
@Override
	public String toString() {
		return "hash [roll_no=" + roll_no + ", name=" + name + "]";
	}

}

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "java";
		String s3 = new String ("java");
		System.out.println("Name of the class is " + s2.getClass());
		System.out.println("S1 " + s1.hashCode());
		System.out.println("S2 " + s2.hashCode());
		
		if(s1 == s3) {
			System.out.println("String Matched");
		}
		else
		{
			System.out.println("Stirng not Matched");
		}
		if (s1.equals(s3)) {
			System.out.println("String Matched");
		}

	}

}
