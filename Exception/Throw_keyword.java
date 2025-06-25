package Exception;

public class Throw_keyword {
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException ("Not valid");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate (19);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest Of Code ");
		}

	}

