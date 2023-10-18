package javaGUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;

/* Database??
class DBConnection{
	Connection con;
	DBConnection(){
		try {
		Class.forName("oracle.jbdc.driver.OracleDriver");
		con = DriverManager.getConnection(
				"jdbc.oracle:thin://@localhost/orcl", "anne", "anne");
		System.out.println("Connection Established...!");
		}catch(Exception e) {}
				
	}
}
*/

class SignUp extends JFrame{
	JTextField t1, t2;
	JButton b1;
	SignUp(){
		setLayout(null);
		
		t1 = new JTextField(60);
		t2 = new JPasswordField(60);
		b1 = new JButton("Submit");
		
		t1.setBounds(100,20,80,30);
		t2.setBounds(100,60,80,30);
		b1.setBounds(100,100,80,30);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					// Database?? DBConnection con = new DBConnection();
					
					FileWriter fw = new FileWriter("login.txt", true);
					fw.write(t1.getText()+"\t"+t2.getText()+"\n");
					fw.close();
					JFrame f = new JFrame();
					JOptionPane.showMessageDialog(f, "Login Created");
					dispose();
				}catch(Exception e) {}
			}
		});
		
		add(t1);
		add(t2);
		add(b1);
	}
}

class Login extends JFrame{
	JTextField t1, t2;
	JButton b1, b2;
	JLabel l1, l2;
	Login(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1 = new JLabel("Login");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(120,10,300,30);
		add(l1);
		
		t1 = new JTextField(60);
		t2 = new JPasswordField(60); // to see use new JTextField(60);
		b1 = new JButton("Sign In");
		b2 = new JButton("Sign Up");
		
		t1.setBounds(100,60,120,30);
		t2.setBounds(100,100,120,30);
		b1.setBounds(120,140,80,30);
		b2.setBounds(120,170,80,30);
		
		l2 = new JLabel("");
		l2.setBounds(250,80,300,30);
		add(l2);
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				boolean match = false;
				String username = t1.getText().toString();
				String password = t2.getText().toString();
				
				try {
					FileReader fr = new FileReader("login.txt");
					BufferedReader br = new BufferedReader(fr);
					String line;
					while((line=br.readLine())!=null) {
						if(line.equals(username+"\t"+password)) {
							match = true;
							break;
						}
					}
					fr.close();
				}catch(Exception e) {}
				if (match) {
					dispose();
					Employer e = new Employer();
					e.setBounds(400,200,400,300);
					e.setVisible(true);					
				} else {
					l2.setText("Invalid Username or Password");
				}
				
				
				/* Hard Coded Code
				if(t1.getText().toString().equals("admin") && t2.getText().toString().equals("admin"))
				{
					dispose();
					Employer e = new Employer();
					e.setBounds(400,200,400,300);
					e.setVisible(true);
					//l2.setText("Welcome");
				}
				else
					l2.setText("Invalid Username or Password");
				*/
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				SignUp s = new SignUp();
				s.setVisible(true);
				s.setBounds(200,200,500,300);
			}
		});
	}
	
}

class LoginScreen{
	public static void main(String[] args) {
		Login l = new Login();
		l.setBounds(400,200,500,300);
		l.setVisible(true);
	}
}

