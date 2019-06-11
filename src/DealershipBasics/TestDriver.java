package DealershipBasics;
import java.util.Scanner;

public class TestDriver {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		LoginScreen login = new LoginScreen();
		login.welcomeMessage();
	}

}
