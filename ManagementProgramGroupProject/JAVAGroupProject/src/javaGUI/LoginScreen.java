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
				"jdbc.oracle:thin://@localhost/orcl", "root", "JackJill20!");
		System.out.println("Connection Established...!");
		}catch(Exception e) {}
				
	}
}
*/

class SignUp extends JFrame {
    JTextField t1, t2;
    JButton b1;
    JRadioButton employeeRadioButton, employerRadioButton;
    ButtonGroup radioGroup;

    SignUp() {
        setLayout(null);

        t1 = new JTextField(60);
        t2 = new JPasswordField(60);
        b1 = new JButton("Submit");

        t1.setBounds(100, 20, 80, 30);
        t2.setBounds(100, 60, 80, 30);
        b1.setBounds(100, 100, 80, 30);

        // Create radio buttons and a button group
        employeeRadioButton = new JRadioButton("Employee");
        employerRadioButton = new JRadioButton("Employer");
        radioGroup = new ButtonGroup();

        // Set the default selection to "Employee"
        employeeRadioButton.setSelected(true);

        // Set the positions of radio buttons
        employeeRadioButton.setBounds(100, 140, 100, 30);
        employerRadioButton.setBounds(200, 140, 100, 30);

        // Add radio buttons to the button group
        radioGroup.add(employeeRadioButton);
        radioGroup.add(employerRadioButton);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Database?? DBConnection con = new DBConnection();

                    FileWriter fw = new FileWriter("login.txt", true);
                    fw.write(t1.getText() + "\t" + t2.getText());

                    // Check which radio button is selected and write to the same line
                    if (employeeRadioButton.isSelected()) {
                        fw.write("\tEmployee\n");
                    } else if (employerRadioButton.isSelected()) {
                        fw.write("\tEmployer\n");
                    }

                    fw.close();
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Login Created");
                    dispose();
                } catch (Exception e) {
                }
            }
        });

        add(t1);
        add(t2);
        add(b1);
        add(employeeRadioButton);
        add(employerRadioButton);
    }
}

class Login extends JFrame {
    JTextField t1, t2;
    JButton b1, b2;
    JLabel l1, l2;
    JRadioButton employeeRadioButton, employerRadioButton;
    ButtonGroup radioGroup;

    Login() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l1 = new JLabel("Login");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setForeground(Color.BLUE);
        l1.setBounds(120, 10, 300, 30);
        add(l1);

        t1 = new JTextField(60);
        t2 = new JPasswordField(60);
        b1 = new JButton("Sign In");
        b2 = new JButton("Sign Up");

        t1.setBounds(100, 60, 120, 30);
        t2.setBounds(100, 100, 120, 30);
        b1.setBounds(120, 140, 80, 30);
        b2.setBounds(120, 170, 80, 30);

        l2 = new JLabel("");
        l2.setBounds(250, 80, 300, 30);
        add(l2);

        // Create radio buttons and a button group
        employeeRadioButton = new JRadioButton("Employee");
        employerRadioButton = new JRadioButton("Employer");
        radioGroup = new ButtonGroup();
        
        // Set the default selection to "Employee"
        employeeRadioButton.setSelected(true);

        // Set the positions of radio buttons
        employeeRadioButton.setBounds(120, 210, 100, 30);
        employerRadioButton.setBounds(230, 210, 100, 30);

        // Add radio buttons to the button group
        radioGroup.add(employeeRadioButton);
        radioGroup.add(employerRadioButton);

        // Add components to the frame
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(employeeRadioButton);
        add(employerRadioButton);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                boolean match = false;
                boolean invalidUsername = true;
                boolean invalidPassword = true;
                String username = t1.getText().toString();
                String password = t2.getText().toString();
                String userType = "";

                if (employeeRadioButton.isSelected()) {
                    userType = "Employee";
                } else if (employerRadioButton.isSelected()) {
                    userType = "Employer";
                }

                try {
                    FileReader fr = new FileReader("login.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.equals(username + "\t" + password + "\t" + userType)) {
                            match = true;
                            break;
                        } else if (line.startsWith(username + "\t")) {
                            invalidUsername = false;
                        } else if (line.endsWith("\t" + userType)) {
                            invalidPassword = false;
                        }
                    }
                    fr.close();
                } catch (Exception e) {}

                if (match) {
                    if ("Employee".equals(userType)) {
                        // Open Employee page
                        dispose();
                        Employer e = new Employer();
                        e.setBounds(400, 200, 400, 300);
                        e.setVisible(true);
                    } else if ("Employer".equals(userType)) {
                        // Open Employer page
                        dispose();
                        Employer e = new Employer();
                        e.setBounds(400, 200, 400, 300);
                        e.setVisible(true);
                    }
                } else {
                    if (!invalidUsername && !invalidPassword) {
                        l2.setText("Invalid User Type");
                    } else if (!invalidUsername || !invalidPassword) {
                        l2.setText("Invalid Password");
                    } else {
                        l2.setText("Invalid Username or Password");
                    }
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                SignUp s = new SignUp();
                s.setVisible(true);
                s.setBounds(200, 200, 500, 300);
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

