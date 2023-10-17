package javaGUI;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	MyFrame(){
		super("First Frame");
		setBounds(300, 200, 800, 400);
		//setSize(500, 300);
		setVisible(true);
		addWindowListener(new WindAdapter());
	}
	public void paint(Graphics g) {
		setForeground(Color.red);
		g.setFont(new Font("TimesRoman",Font.BOLD, 25));
		g.drawString("MISS STATE UNIVERSITY", 270, 180);
	}
}

class WindAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

class LoginScreen{
	public static void main(String[] args) {
		new MyFrame();
	}

}

