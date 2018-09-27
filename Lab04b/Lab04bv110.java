// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bv110 extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawRect(100, 100, 200, 200);
		g.drawRect(150, 150, 200, 200);
		g.drawLine(100, 100, 150, 150);
		g.drawLine(100, 300, 150, 350);
		g.drawLine(300, 100, 350, 150);
		g.drawLine(300, 300, 350, 350);


		// DRAW SPHERE
		g.drawOval(135, 135, 180, 180);
		g.drawOval(155, 135, 140, 180);
		g.drawOval(175, 135, 100, 180);
		g.drawOval(195, 135, 60, 180);
		g.drawOval(215, 135, 20, 180);
		g.drawOval(135, 155, 180, 140);
		g.drawOval(135, 175, 180, 100);
		g.drawOval(135, 195, 180, 60);
		g.drawOval(135, 215, 180, 20);

		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
		g.drawOval(600, 100, 300, 300);
		g.drawLine(600, 250, 750, 400);
		g.drawLine(600, 250, 900, 250);
		g.drawLine(750, 400, 900, 250);
		g.drawOval(688, 250, 124, 124);


		// DRAW APCS
		g.fillRect(100, 400, 25, 125);
		g.fillRect(100, 400, 75, 25);
		g.fillRect(100, 450, 75, 25);
		g.fillRect(150, 400, 25, 125);
		
		g.fillRect(200, 400, 25, 125);
		g.fillRect(200, 400, 75, 25);
		g.fillRect(200, 450, 75, 25);
		g.fillRect(250, 400, 25, 50);
		
		g.fillRect(300, 400, 25, 125);
		g.fillRect(300, 400, 75, 25);
		g.fillRect(300, 500, 75, 25);
		
		g.fillRect(400, 400, 25, 75);
		g.fillRect(400, 400, 75, 25);
		g.fillRect(400, 450, 75, 25);
		g.fillRect(450, 450, 25, 75);
		g.fillRect(400, 500, 75, 25);

		// DRAW PACMEN FLOWER
		g.fillArc(600, 400, 110, 110, 135, 270);
		g.fillArc(600, 550, 110, 110, 315, 270);
		g.fillArc(675, 475, 110, 110, 45, 270);
		g.fillArc(525, 475, 110, 110, 225, 270);


	}

}


