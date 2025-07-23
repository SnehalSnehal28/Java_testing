package oops;
class A{
	void PrintArray(int a[]) {
		System.out.println("Printing Array");
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}
}
public class array_function{
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = {100,200,300,400,500};
		A obj = new A();
		obj.PrintArray(a);
		obj.PrintArray(b);
	}
}
