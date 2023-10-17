package javaGUI;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	MyFrame(){
		super("First Frame");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				setVisible(false);
				System.exit(0);
			}
		});
	}
}


class LoginScreen{
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.setBounds(300,200,800,400);
		//setSize(500, 300);
		mf.setVisible(true);
		mf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				Graphics g = mf.getGraphics();
				mf.setForeground(Color.red);
				g.setFont(new Font("TimesRoman",Font.BOLD, 20));
				g.drawString("MISS STATE UNIVERSITY", me.getX(), me.getY());
			}
		});
	}
}

