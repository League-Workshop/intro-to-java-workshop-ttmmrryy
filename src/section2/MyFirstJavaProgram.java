package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot Kellen = new Robot();
		Kellen.setSpeed(30);
		Kellen.penDown();
		Kellen.sparkle();
		Kellen.setPenColor(Color.BLUE);
		for (int i = 0; i < 4; i++) {
			Kellen.move(200);
			Kellen.turn(90);
		}
	}
}
