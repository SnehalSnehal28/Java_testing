package oops;

import java.util.Scanner;
class emp {
	int a;
	String b;
	double c;
	double DA,HRA,Gross_salary,Tax,Net_salary;
	emp (int id,String name,double basic_salary) {
		a=id;
		b=name;
		c=basic_salary;
		DA= basic_salary * 0.02;
		HRA= basic_salary * 0.03;
		Gross_salary= basic_salary+DA+HRA;
		Tax=Gross_salary * 0.03;
		Net_salary=Gross_salary - Tax;
		System.out.println("Employee ID: "+a);
		System.out.println("Employee Name: "+b);
		System.out.println("Employee Salary: "+c);
		System.out.println("Employee DA 2% "+DA);
		System.out.println("Employee HRA 3%: "+HRA);
		System.out.println("Employee Gross_salary: "+Gross_salary);
		System.out.println("Employee Tax: "+Tax);
		System.out.println("Employee Net Salary: "+ Net_salary);
		
	}
}

public class user_emp_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int a = sc.nextInt();
		System.out.println("Employee ID is: "+a);
		
		System.out.println("Enter Employee Name");
		String b = sc.next();
		System.out.println("Employee Name is: "+b);
		
		System.out.println("Enter Employee Basic Salary");
		double c = sc.nextDouble();
		System.out.println("Employee Basic Salary is: "+c);
		
		emp e = new emp (a,b,c);
	}

}
