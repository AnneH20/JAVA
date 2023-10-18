package javaGUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Login extends JFrame{
	JTextField t1, t2;
	JButton b1;
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
		
		t1.setBounds(100,60,120,30);
		t2.setBounds(100,100,120,30);
		b1.setBounds(120,140,80,30);
		
		l2 = new JLabel("");
		l2.setBounds(250,80,300,30);
		add(l2);
		
		add(t1);
		add(t2);
		add(b1);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
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

