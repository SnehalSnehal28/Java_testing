package oops;
class employee {
	int a;
	String b;
	double c,DA,HRA,Gross_salary,Tax,Net_salary;
	employee (int emp_id, String emp_name,double basic_salary ){
		a=emp_id;
		b=emp_name;
		c=basic_salary;
		DA = basic_salary * 0.02;
		HRA = basic_salary * 0.03;
		Gross_salary = basic_salary+DA+HRA;
		Tax = Gross_salary * 0.03;
		Net_salary = Gross_salary - Tax;
	}
	void disp() {
		System.out.println("Employee ID: " + a);
		System.out.println("Employee Name: " + b);
		System.out.println("Employee Basic Salary: " + c);
		System.out.println("Employee DA: " + DA);
		System.out.println("Employee HRA: " + HRA);
		System.out.println("Employee Gross Salary: " + Gross_salary);
		System.out.println("Employee Tax: " + Tax);
		System.out.println("Employee Net Salary: " + Net_salary);
		
	}
	
	
}
public class employeeobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1 = new employee(1,"Snehal",25000);
		e1.disp();
	
		

	}

}
