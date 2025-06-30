package oops;

class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("java");
		System.out.println(sb);
		
		//insert
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1 , "Java");
		System.out.println(sb1);
		
		//replace
		StringBuffer sb2= new StringBuffer("Hello ");
		sb2.replace(1 ,3, "Java");
		System.out.println(sb2);
		
		//delete
		StringBuffer sb3= new StringBuffer("Hello ");
		sb3.delete(1 ,3);
		System.out.println(sb3);
		
		//reverse
		StringBuffer sb4= new StringBuffer("Hello");
		sb4.reverse();
		System.out.println(sb4);
		
		//capacity
		StringBuffer sb5= new StringBuffer();
		System.out.println(sb5.capacity()); //default 16
		sb5.append("Hello ");
		System.out.println(sb5.capacity()); //now 16
		sb5.append("Java is my favorite language");
		System.out.println(sb5.capacity());// now (16 * 2)+2=34 i.e (oldcapacity*2)+2
		
		//Ensure capacity
		StringBuffer sb6= new StringBuffer();
		System.out.println(sb6.capacity()); //default 16
		sb6.append("Hello ");
		System.out.println(sb6.capacity()); //now 16
		sb6.append("Java is my favorite language");
		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e(oldcapacity * 2)+2
		sb6.ensureCapacity(10);//now no change
		System.out.println(sb6.capacity());// now 34
		sb6.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb6.capacity());//now 70
		
		
		
		
	}

	

}
