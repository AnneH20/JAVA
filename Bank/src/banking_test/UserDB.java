package banking_test;

import java.util.ArrayList;
import java.util.List;


public class UserDB {

	public List<String> IDs;
	public List<String> Passwords;
	
	public UserDB(){
		IDs = new ArrayList<>();
		Passwords = new ArrayList<>();
		
	}
	
	public void Signup(String userID, String Userpassword) {
		IDs.add(userID);
		Passwords.add(Userpassword);
	}
	
	public boolean verifyUser(String userID, String Userpassword) {
		int index = IDs.indexOf(userID);
		
		if (index!=-1 && Passwords.get(index).equals(Userpassword))
		{
		return true;
		}
		return false;
	}
	
	
	
}
