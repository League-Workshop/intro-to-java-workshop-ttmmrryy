package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is 5 times 5");
		// 3.  Use an if statement to check if their answer is correct
		if (input.equalsIgnoreCase("25")) {
			JOptionPane.showMessageDialog(null, "You got the 1st question correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You got the 1st question Wrong!");
		}
		
		String input2 = JOptionPane.showInputDialog("What is 8 times 8");
		
		if (input2.equalsIgnoreCase("64")) {
			JOptionPane.showMessageDialog(null, "You got the 2nd question correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You got the 2nd question Wrong!");
		}
		
		
		String input3 = JOptionPane.showInputDialog("What is 21 times 21");
		
		if (input3.equalsIgnoreCase("441")) {
			JOptionPane.showMessageDialog(null, "You got the 3rd question correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "You got the 3rd question Wrong!");
		}
		JOptionPane.showMessageDialog(null, "Your score is : " + score + "/3");
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
