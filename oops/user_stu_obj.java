package oops;

import java.util.Scanner;
class stu {
	int a;
	String b;
	String c;
	stu (int id,String name,String course) {
		a=id;
		b=name;
		c=course;
		System.out.println("Student ID"+ a);
		System.out.println("Student Name" + b);
		System.out.println("Student Course: " + c);
	}
}

public class user_stu_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int a = sc.nextInt();
		System.out.println("StudentID is :"+a);
		
		System.out.println("Enter Student Name:");
		String b = sc.next();
		System.out.println("Student name is:"+b);
		
		System.out.println("Enter Student Course:");
		String c= sc.next();
		System.out.println("Student Course is :"+c);
		
		

	}

}
