package practice;
abstract class Vehicle{
	abstract void startEngine();
	
	void FuelType() {
		System.out.println("Petrol or Diesel: ");
	}
}
class Car extends Vehicle {
	void startEngine() {
		System.out.println("Car Engine Start");
	}
}
class Bike extends Vehicle{
	void startEngine() {
		System.out.println("Bike Engine Start");
	}
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car ();
		c.startEngine();
		c.FuelType();
		
		
		Bike b = new Bike();
		b.startEngine();
		b.FuelType();
		
		
		
		
		

	}

}
