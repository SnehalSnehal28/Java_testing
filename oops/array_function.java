package oops;
 
class A{
	void printArray (int a[]) {
		System.out.println("Printing Array");
		for (int i=0;i<5;i++) {
		System.out.println(a[i]);
	}
	}
}

public class array_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		int b[] = {100,200,300,400,500};
		A obj = new A();
		obj.printArray(a);
		obj.printArray(b);

	}

}
