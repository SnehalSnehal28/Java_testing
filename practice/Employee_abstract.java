package practice;
abstract class employee{
	abstract void calculateSalary();
	
	void employeeDetails(String name,int id) {
		String name1;
		int id1;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + id);
	}
}
class fullTimeEmp extends employee{
	void calculateSalary() {
		System.out.println("Full time salary is 33000");
	}
	
}
class partTimeEmp extends employee{
	void calculateSalary() {
		System.out.println("Part time salary is 3000");
	}
	
}

public class Employee_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fullTimeEmp f = new fullTimeEmp();
		f.employeeDetails("Snehal",101);
		f.calculateSalary();
		System.out.println();
		partTimeEmp p = new partTimeEmp();
		p.employeeDetails("Reena",102);
		p.calculateSalary();
	}

}
