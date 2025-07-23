package practice;
public class Static_Keyword {
	int id;
	String name;
	static String collage = "Abc";

	Static_Keyword(int i, String s){
	this.id=i;
	this.name=s;
}
void disp() {
	System.out.println(id + " " + name + " " + collage + " ");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Keyword st = new Static_Keyword(1,"Snehal");
		st.disp();
		Static_Keyword st1 = new Static_Keyword(2,"Reena");
		st1.disp();

	}

}
