/**
 * 
 */

/**
 * @author Caitlin Stewart
 * Chapter 16
 * Program 14
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class JNestedBoxes extends JFrame {


public JNestedBoxes()
{
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
	
public void paint(Graphics gr)
{
	int z=50;
	int x = 300;
	int y= 300;
			
	super.paint(gr);
	Graphics2D  gr2D = (Graphics2D)gr;
	
	
	for (int i=1; i < 9; i++)
		
		
	{
		
		Rectangle2D.Float rect = new Rectangle2D.Float(z, z, x, y);
		gr2D.draw(rect);
		z += 10;
		x -= 20;
		y -= 20;
	
	}
}

	
	public static void main(String[] args) 
	{
	
		JNestedBoxes frame= new JNestedBoxes();
		frame.setSize(400,400);
		frame.setVisible(true);

	}

}
