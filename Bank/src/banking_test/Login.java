package banking_test;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		UserDB u = new UserDB();
		
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Enter your signup ID");
		String ID = input.nextLine();
		
		System.out.print("Enter your signup password");
		String pasword = input.nextLine();
		
		u.Signup(ID, pasword);
		
		
		System.out.print("Enter your Sign in ID");
		String signinID = input.nextLine();
		
		System.out.print("Enter your Sign in password");
		String signinpasword = input.nextLine();
		
		if(u.verifyUser(signinID, signinpasword)) {
		  System.out.println("Login Success/Verified "+ signinID);
			 
			
		} else {
			System.out.println("Login Fail ");
		}
		
		
		
		

	}

}
