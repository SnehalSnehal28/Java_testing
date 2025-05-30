package oops;
import java.util.Scanner;

public class switch_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("1.BMW");
		System.out.println("2.Audi");
		System.out.println("3.Tata");
		System.out.println("Select Car menu");
		int car= sc.nextInt();
		 switch(car) {
		 case 1:
			 System.out.println("BMW models: ");
			         System.out.println("1.BMW i7");
			         System.out.println("2.BMW x5");
			         System.out.println("3.BMW 5 series");
			         System.out.println("Select Model menu: ");
			         int BMWmodel = sc.nextInt();
			         switch (BMWmodel) {
			         case 1:
			        	 System.out.println("BMW i7 price is Rs.2.77 carore");
			        	 break;
			         case 2:
			        	 System.out.println("BMW x5 price is Rs.1.20 carore");
			        	 break;
			         case 3:
			        	 System.out.println("BMW 5 series price is Rs.72.90 lakh");
			        	 break;
			         default:
			        	 System.out.println("Get lost");
			         }
			         break;
		 case 2:	
			 System.out.println("Audi models: ");
			         System.out.println("1.Audi Q8");
	                 System.out.println("2.Audi A6");
	                 System.out.println("3.Audi Q3");
	                 System.out.println("Select Model menu: ");
	                 int Audimodel = sc.nextInt();
	                 switch (Audimodel) {
	                 case 1:
	        	          System.out.println("Audi Q8 price is Rs.1.41 carore");
	        	          break;
	                 case 2:
	        	          System.out.println("Audi A6 price is Rs.80.18 lakh");
	        	          break;
	                 case 3:
	        	          System.out.println("Audi Q3 series price is Rs.55.71 lakh");
	        	          break;
	                 default:
	        	          System.out.println("Get lost");
	         }
	                  break;
		 case 3:
	             System.out.println("Tata models: ");
				         System.out.println("1.Nexon:");
		                 System.out.println("2.Punch: ");
		                 System.out.println("3.Tiago: ");
		                 System.out.println("Select Model menu: ");
		                 int Tatamodel= sc.nextInt();
		                 switch (Tatamodel) {
		                 case 1:
		        	          System.out.println("Nexon price is Rs.9 lakh");
		        	          break;
		                 case 2:
		        	          System.out.println("Punch price is Rs.6 lakh");
		        	          break;
		                 case 3:
		        	          System.out.println("Tiago series price is Rs.5.5 lakh");
		        	          break;
		                 default:
		        	          System.out.println("Get lost");
		         }
		                  break;
		                  
		  default:
			  System.out.println("Get lost");
	                  
			 }
			   
		 }
		

	}


