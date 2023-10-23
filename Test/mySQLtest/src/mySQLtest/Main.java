package mySQLtest;
import java.sql.*;

public class Main {
	public static void main(String args[]) {
		Connection con = null;
		Statement stmt = null;
		ResultSet results = null;
		String Name;
		int age;
		// Register JDBC
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("JDBC not register");
			return;
		}
		System.out.println("JDBC Registered!");
		// Connect to Database
		System.out.println("Connecting to the database...");
		try{
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/CRUD", "root", "");
		}catch(Exception e) {
			System.out.println("MySQL Database not connected");
		}
		
		if (con != null) {
			System.out.println("Success. Connected to database");
		}
		/* Create a table
		System.out.println("Creating a table...");
		try {
		stmt = con.createStatement();
		String sql = "CREATE TABLE loginDB("+
					 "Username VARCHAR(255),"+
					 "Password VARCHAR(255),"+
					 "EmployeeLevel int);";
		stmt.executeUpdate(sql);
		}catch(SQLException e) {
			System.out.println("Table cannot be created!");
			return;
		}
		System.out.println("Table created successfully");
		*/
		
		// Insert into table
		System.out.println("Inserting into a table...");
		try {
		stmt = con.createStatement();
		String sql = "INSERT INTO loginDB(EmployeeLevel,Username,Password) VALUES(1,'Emily','Emily'), (2, 'Hannah', 'Hannah'), (1, 'Anne', 'Anne');";
		stmt.executeUpdate(sql);
		}catch(SQLException e) {
			System.out.println("Record cannot be inserted!");
			return;
		}
		System.out.println("Successfully added the record");
		
		
		/* Display Table
		try {
			stmt = con.createStatement();
			String sql = "SELECT Name,MARKS FROM students";
			results = stmt.executeQuery(sql);
			boolean Records = results.next();
			if (!Records) {
				System.out.println("No rows in the table");
				System.exit(0);
			}
			
		try {
		 do {
				Name = results.getString(1);
				age = results.getInt(2);
				System.out.print(" "+Name);
				System.out.print(" "+age);
				System.out.println();
				
			}while(results.next());
			stmt.close();
		}
			catch(SQLException e) {
				System.out.println("DATA DISPLAY ERROR");
			}
		}
		catch(SQLException e) {
			System.out.println("No records found"+e);
			return;
		}
		*/
	}
}
