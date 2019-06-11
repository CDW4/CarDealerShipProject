package DealershipBasics;
import java.util.Scanner;


public class LoginScreen {
	
	String username;
	
	String password;
	
	public void welcomeMessage() {
		System.out.println("============================");
		System.out.println("Welcome! We thank you for using the Sunshine Dealership App.");
		System.out.println("Let's get started... ");
		System.out.println("============================");
		System.out.println("Are you an employee, customer, or new user?");
		System.out.println("============================");
	}
	
	public void userTypePrompt() {
		String emp = "employee";
		String cust = "customer";
		String newU = "new user";
		
		

	}
	
	
	public boolean verifyUserType(String type) {
		System.out.println("============================");
		do 
		{
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
	}

	

}
