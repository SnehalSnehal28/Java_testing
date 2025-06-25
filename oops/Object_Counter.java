package oops;
class Object_Counter {
	static int count = 0;
	Object_Counter(){
		count++;
		System.out.println("Object " + count + " Created");
	}
	static void disp() {
		System.out.println("Total object created: "+ count);
		
	}

	public static void main(String[] args) {
		Object_Counter obj1 = new Object_Counter();
		Object_Counter obj2 = new Object_Counter();
		Object_Counter obj3 = new Object_Counter();
		Object_Counter.disp();
}
}