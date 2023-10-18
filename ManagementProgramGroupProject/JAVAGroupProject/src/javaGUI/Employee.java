package javaGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Employee extends JFrame{
	JLabel l1;
	JTextField t1, t2;
	JButton b1, b2, b3, b4;
	Employee(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		l1 = new JLabel("Employee View");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(60,10,300,30);
		add(l1);
		
		t1 = new JTextField(60);
		t2 = new JTextField(60);
		
		b1 = new JButton("Clock In");
		b2 = new JButton("Clock Out");		
		b3 = new JButton("Log Out");
		
		t1.setBounds(100,60,120,30);
		t2.setBounds(100,100,120,30);
		
		b1.setBounds(100,140,100,30);
		b2.setBounds(200,140,100,30);
		
		b3.setBounds(125,180,75,30);
		
		add(b1);
		add(b2);
		add(b3);
		
		add(t1);
		add(t2);
	}
}

class SimpleEmployee{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setBounds(400,200,400,300);
		e.setVisible(true);
	}
}
