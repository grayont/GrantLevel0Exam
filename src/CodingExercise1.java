/* Level 0 Exam: Coding  Exercise #1 */


import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		Robot Swaglord = new Robot();
		Swaglord.penDown();
		Swaglord.setSpeed(999);
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color should the robot draw?");
		
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(color.equalsIgnoreCase("green")){
			Swaglord.setPenColor(Color.green);
		}
		else if(color.equalsIgnoreCase("blue")){
			Swaglord.setPenColor(Color.blue);
		}
		
		// 2. set the pen width to 10
		Swaglord.setPenWidth(10);
		
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 4; i++) {
			Swaglord.move(100);
			Swaglord.turn(90);
			
		}
		
	}
}





