package banking_test;

import java.util.ArrayList;
import java.util.List;


public class UserDB {

	public List<String> IDs;
	public List<String> Password;
	
	
	public UserDB() {
		IDs = new ArrayList<>();
		Password = new ArrayList<>();
		
	}
	
	public void Signup(String userID, String Userpassword) {
		IDs.add(userID);
		Password.add(Userpassword);
	}
	
	public boolean verifyUser(String userID, String Userpassword) {
		int index = IDs.indexOf(userID);
		
		if (index != -1 && Password.get(index).equals(Userpassword)) 
		{
			return true;
		}
		return false;
	}
	
	
	
}
