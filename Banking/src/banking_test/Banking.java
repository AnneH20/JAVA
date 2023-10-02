package banking_test;
import java.util.Scanner;


public class Banking {

	public static void main(String[] args) {
		Bank b = new Bank();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Create your Account");
		String account_num = input.nextLine();
		
		System.out.print("Create your Account");
		String initial_balance = input.nextLine();
		
		
		b.createAccount(account_num, Integer.);

	}

}
