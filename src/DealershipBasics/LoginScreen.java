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
	}
	
	public void userTypePrompt() {
		String emp = "employee";
		String cust = "customer";
		String newU = "new user";
		
		System.out.println("============================");
		System.out.println("Are you a customer, employee, or new user?");
		System.out.println("============================");
		
		scanner.nextLine();
	}
	
	

}
