package section3;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotCommander {
	public static void main(String[] args) {
		Robot Kellen = new Robot();
		Kellen.setSpeed(100);
		String input = JOptionPane.showInputDialog("What color do you like? You can pick red, green, or blue.");
		if (input.equalsIgnoreCase("red")) {
			Kellen.setPenColor(Color.RED);
		}
		else if (input.equalsIgnoreCase("blue")){
			Kellen.setPenColor(Color.BLUE);
		}
		else if (input.equalsIgnoreCase("green")) {
			Kellen.setPenColor(Color.GREEN);
		}
		else {
			Kellen.setRandomPenColor();
		}
		Kellen.penDown();
		for (int i = 0; i < 12; i++) {
			Kellen.move(100);
			Kellen.turn(30);
		}
	}
}
