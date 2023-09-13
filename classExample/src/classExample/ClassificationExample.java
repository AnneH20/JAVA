package classExample;
import javax.swing.JOptionPane;

public class ClassificationExample {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in = JOptionPane.showInputDialog("Scores from students");
		
		if (Integer.parseInt(in) <= 100 && Integer.parseInt(in) >= 0 && in != null) {
			
		
		int score = Integer.parseInt(in);
		
		String grade;
		
		int category = score/10;
		
		if(category >= 9) {
			grade = "A";
		}
		else if (category >= 8) {
			grade = "B";
		}
		else if(category >= 7) {
			grade = "C";
		}
		else if(category >= 6) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		JOptionPane.showMessageDialog(null, "Grade: " + grade);
		}
		
		else {
			System.out.println("Error");
		}		
	}
}
