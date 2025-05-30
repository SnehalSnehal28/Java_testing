package oops;

import java.util.Scanner;

public class student_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of subject 1:");
		int m1 = sc.nextInt();
		System.out.println("Enter marks of subject 2");
		int m2 = sc.nextInt();
		System.out.println("Enter marks of subject 3");
		int m3 = sc.nextInt();
		
		if (m1 < 40 || m2 < 40 || m3 <40) {
			System.out.println("Result is Fail");
		}
		else {
			int total = m1+m2+m3;
			double percentage = total/3;
			String grade;
			 
			if (percentage > 85) {
			 grade = "A";
			}
			else if (percentage > 70) {
				grade = "B";
			}
			else if (percentage > 55) {
				grade = "C";
			}
			else {
				grade = "D";
			}
			System.out.println("Total " + total);
			System.out.println("Percentage " + percentage);
			System.out.println("Grade " + grade);
				
		    }

}
}
