package DealershipBasics;
import java.util.Scanner;

public class TestDriver {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		LoginScreen login = new LoginScreen();
		TestDriver test = new TestDriver();
		login.welcomeMessage();
		String type = scanner.nextLine();
		
		boolean ver = false;
		
		System.out.println("============================");
		do {
		if (type.compareToIgnoreCase("employee") == 0) {
			System.out.println("You have reached the Employee Login Page. Please Sign In.");
			ver = true;
//			return true;
		}else if (type.compareToIgnoreCase("customer") == 0) {
			System.out.println("You have reached the Employee Login Page. Please Sign In.");
			ver = true;
//			return true;
		}else if (type.compareToIgnoreCase("New User") == 0) {
			System.out.println("You are a New User. Please create an Account/Register Below.");
			ver = true;
//			return true;
		} else {
			System.out.println("Please enter a title from the given options (i.e. Customer, Employee....).");
			ver = false;
//			return false;
		}
		
		} while (ver == false);
		
		System.out.println("============================");
		
		
		System.out.println("Enter Username: ");
		String generalUser = scanner.nextLine();
		
		System.out.println("Enter Password: ");
		String generalPass = scanner.nextLine();
		
		/*this.verifyUserType*/
		
		
		
	
/*	public boolean verifyUserType(String type) {
		System.out.println("============================");
		do {
		if (type.compareToIgnoreCase("employee") == 0) {
			System.out.println("You have reached the Employee Login Page. Please Sign In.");
			return true;
		}else if (type.compareToIgnoreCase("customer") == 0) {
			System.out.println("You have reached the Employee Login Page. Please Sign In.");
			return true;
		}else if (type.compareToIgnoreCase("New User") == 0) {
			System.out.println("You are a New User. Please create an Account/Register Below.");
			return true;
		} else {
			System.out.println("Please enter a title from the given options (i.e. Customer, Employee....).");
			return false;
		}
		
		} while (false);
		
		System.out.println("============================");
	
*/
	}
}
