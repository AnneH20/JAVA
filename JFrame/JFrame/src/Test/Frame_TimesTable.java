package Test;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame_TimesTable {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Times Tables");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.pack();
		
		
		JPanel panel = new JPanel();
		JTextField inputField = new JTextField(5);
		JButton calculateButton = new JButton("Calculation ");
		JLabel resultLabel = new JLabel();
		calculateButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						int number = Integer.parseInt(inputField.getText());
						StringBuilder result = new StringBuilder();
						for (int i = 1; i <= 9; i++) {
							result.append(number).append(" x").append(i).append(" = ").append(number * i).append("\n");
						}
						resultLabel.setText(result.toString());
					} catch (NumberFormatException ex) {
						resultLabel.setText("Insert Correct Integer ");
					}
				}
			}
			);
			panel.add(new JLabel("Input Number: "));
			panel.add(inputField);
			panel.add(calculateButton);
			panel.add(resultLabel);
			frame.getContentPane().add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
	}
}
