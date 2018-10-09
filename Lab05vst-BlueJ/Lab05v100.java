// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v100 extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        
        int xChange = 0;
        int yChange = 0;
        
        for(int i = 0; i <= 30; i++) {
            g.drawLine(x1 + xChange, y1, x2, y2 - yChange);
            
            xChange += width / 30;
            yChange += height / 30;
        }
        
        xChange = 0;
        yChange = 0;
        
        for(int i = 0; i <= 30; i++) {
            g.drawLine(x2 - xChange, y1, x1, y2 - yChange);
            
            xChange += width / 30;
            yChange += height / 30;
        }
        
        xChange = 0;
        yChange = 0;
        
        for(int i = 0; i <= 30; i++) {
            g.drawLine(x1 + xChange, y2 - 630, x2, y1 + yChange - 630);
            
            xChange += width / 30;
            yChange += height / 30;
        }
        
        xChange = 0;
        yChange = 0;
        
        for(int i = 0; i <= 30; i++) {
            g.drawLine(x1, y1 + yChange - 630, x2 - xChange, y2 - 630);
            
            xChange += width / 30;
            yChange += height / 30;
        }
    }
}

