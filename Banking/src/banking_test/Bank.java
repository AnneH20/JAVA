package banking_test;

import java.util.Map;
import java.util.HashMap;

public class Bank {

	private Map<String, Double> account;
	
	public Bank() {
		account = new HashMap<>();
	}
	
	public void createAccount(String account_num, double initial_deposit) {
		account.put(account_num, initial_deposit);
	}
	
	public double checkBalance(String account_num) {
		
		return account.getOrDefault(account_num, 0.0);
	}
	
	public void deposit(String account_num, double deposit) {
		account.put(account_num, account.getOrDefault(account_num, 0.0) + deposit);
	}
	
	public void withdraw(String account_num, double withdraw) {
		if (account.containsKey(account_num)) {
			double currentbalance = account.get(account_num);
			if (currentbalance >= withdraw) {
				account.put(account_num, currentbalance - withdraw);
			} else {
				System.out.println("Insufficient fund");
			}
			System.out.println("No account");
		}
	}
	
	public void transfer(String fromAccount, String toAccount, double amount) {
		if (account.containsKey(fromAccount) && account.containsKey(toAccount)) {
			double senderbalance = account.get(fromAccount);
			if (senderbalance >= amount) {
				account.put(fromAccount, senderbalance - amount);
				account.put(toAccount, senderbalance + amount);
				System.out.println("Transfer completed");
			} else {
				System.out.println("No money");
			}
		} else {
			System.out.println("No account");
		}
	}
	
}
