package oops;
class st {
	st() {
		System.out.println("Parent constructor");
	}
	st(int a){
		System.out.println("Parent parameter");
	}
}
class s extends st{
	s() {
		System.out.println("child constructor");
	}
	s(int a){
		super (a);{
			System.out.println("child parameter");
		}
	}
}

public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s obj = new s(10);
		
		
	}
}
