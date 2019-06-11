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
			System.out.println("============================");
			System.out.println("Create a New Account Below.");
			System.out.println();
			System.out.println("Enter an E-mail / Username: ");
			String user1 = scanner.nextLine();
			System.out.println("Enter a New Password: ");
			String pw1 = scanner.nextLine();
			System.out.println("Confirm New Password (Type Again): ");
			String pw2 = scanner.nextLine();
			
			System.out.println("Thank you for Registering. You will now be directed back to the Login Screen.");
			
			login.welcomeMessage();
			type = scanner.nextLine();
			
			System.out.println("============================");
			continue;
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
		
		System.out.println("============================");
		
		
		if (type.compareToIgnoreCase("employee") == 0) {
			System.out.println("============================");
			System.out.println("Employee Dashboard");
			System.out.println("A. View / Edit Car Lot");
			System.out.println("\t" + " 1. Add Car(s) ");
			System.out.println("\t" + " 2. Remove Car(s)");
			System.out.println("B. View Payments");
			System.out.println("\t" + " 1. Find User ");
			System.out.println("\t" + " 2. View List of User's Car & Payments ");
			System.out.println("C. Manage Offers");
			System.out.println("\t" + "Offers for Car 1");
			System.out.println("\t\t" + "[User 1] - Offer of [$$$$]");
			System.out.println("\t\t" + "[User 2] - Offer of [$$$$]");
			System.out.println("\t\t" + "Wwould you like to accept or reject any offers?");
			System.out.println("\t" + "Offers for Car 2");
			System.out.println("\t\t" + "[User 45] - Offer of [$$$$]");
			System.out.println("\t\t" + "[User 57] - Offer of [$$$$]");
			System.out.println("\t\t" + "Wwould you like to accept or reject any offers?");
			
			System.out.println("============================");
//			ver = true;
//			return true;
		}else if (type.compareToIgnoreCase("customer") == 0) {
			System.out.println("============================");
			System.out.println("Customer Dashboard");
			System.out.println("A. View Car Lot");
			System.out.println("\t" + " 1. [Car 1] ");
			System.out.println("\t\t" + " Make an Offer (Y/N)? ");
			System.out.println("\t" + " 2. [Car 2] ");
			System.out.println("\t\t" + " Make an Offer (Y/N)? ");
			System.out.println("B. View Payments");
			System.out.println("\t" + "List of Cars Owned: ");
			System.out.println("\t\t" + "1) [Car + Payments Made + Payments Left + Monthly Payment Amount] ");
			System.out.println("============================");
			
//			ver = true;
//			return true;
		}else if (type.compareToIgnoreCase("New User") == 0) {
			System.out.println("============================");
			System.out.println("Create a New Account Below.");
			System.out.println();
			System.out.println("Enter an E-mail / Username: ");

			System.out.println("Enter a New Password: ");
			String pw1 = scanner.nextLine();
			System.out.println("Confirm New Password (Type Again): ");
			String pw2 = scanner.nextLine();
			
			System.out.println("============================");
			
//			ver = true;
//			return true;
		} else {
			System.out.println("Please enter the correct login credentials");
//			ver = false;
//			return false;
		}
		
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
