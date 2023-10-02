package banking_test;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		UserDB u = new UserDB();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your signup ID");
		String ID = input.nextLine();
		
		System.out.print("Enter your signup password");
		String password = input.nextLine();
		
		u.Signup(ID, password);
		
		System.out.print("Enter your Sign in ID");
		String signinID = input.nextLine();
		
		System.out.print("Enter your Sign in password");
		String signinpassword = input.nextLine();
		
		if (u.verifyUser(signinID, signinpassword)) {
			System.out.println("Login Success/Verified " + signinID);
			
		} else {
			System.out.println("Login Fail");
		}
		
	}

}
