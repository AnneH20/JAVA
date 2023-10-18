package frame_pkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame_Without_Actions {
	public static void main(String[] args) {
			JFrame frame = new JFrame("Frame Test");
			frame.setSize(300,300);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout());
			JButton button1 = new JButton("Click This");
			JTextField text1 = new JTextField(10);
			JTextArea result1 = new JTextArea(10,25);
			frame.add(text1);
			frame.add(button1);
			frame.add(result1);
			frame.setVisible(true);
		}
}
