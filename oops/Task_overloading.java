package oops;
class fbLogin {
	void login (String username,String password) {
		System.out.println("Login with Username: " + username + " Password: " + password);
	}
	void login (int mobile_no,int OTP) {
		System.out.println("Login with Mobile Number: " + mobile_no + " OTP: " + OTP);
	}
	void login (String email) {
		System.out.println("Login with Email: " + email);
	}
}

public class Task_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fbLogin log=new fbLogin();
		log.login("snehal_solanki","Snehal#123");
		log.login("8866867140" ,"654327");
		log.login("snehal@gmail.com");
	}

}
