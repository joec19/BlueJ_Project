// Lab06v100.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v100 extends Applet
{
    
    public void paint(Graphics g)   
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        
        int red;
        int blue; // RGB values
        int green;
        
        // Draw Random Lines
        int x1;
        int y1; // Line Location Values
        int x2;
        int y2;

        for(int i=0;i<100;i++) {
            red=(int)(Math.random()*254);
            blue=(int)(Math.random()*254); // Get Random RGB
            green=(int)(Math.random()*254);
            g.setColor(new Color(red,blue,green));
            
            x1=(int)(Math.random()*389)+10;
            x2=(int)(Math.random()*389)+10;
            y1=(int)(Math.random()*289)+10; // Get Random Location
            y2=(int)(Math.random()*289)+10;
            
            g.drawLine(x1,y1,x2,y2);
        }

        // Draw Random Squares
        int x;
        int y; // Location Values
        
        for(int i=0;i<100;i++) {
            red=(int)(Math.random()*254);
            blue=(int)(Math.random()*254); // Get Random RGB
            green=(int)(Math.random()*254);
            g.setColor(new Color(red,blue,green));
            
            x=(int)(Math.random()*339)+400;
            y=(int)(Math.random()*239)+10;
            
            g.fillRect(x,y,50,50);
        }
        // Draw Random Circles
        int width;
        int height;
        int radius;
        
        for(int i=0;i<100;i++) {
            red=(int)(Math.random()*254);
            blue=(int)(Math.random()*254); // Get Random RGB
            green=(int)(Math.random()*254);
            g.setColor(new Color(red,blue,green));
            
            x=(int)(Math.random()*389)+10;
            y=(int)(Math.random()*299)+300;
            width=(int)(Math.random()*(399-(x)));
            height=(int)(Math.random()*(289-(y-300)));
            radius=Math.min(width,height);

            g.drawOval(x,y,radius,radius);
        }
        // Draw 3-D Box
       Polygon rightSide=new Polygon();
       rightSide.addPoint(440,330);
       rightSide.addPoint(480,370);
       rightSide.addPoint(480,420);
       rightSide.addPoint(440,380);
       Polygon leftSide=new Polygon();
       leftSide.addPoint(490,330);
       leftSide.addPoint(530,370);
       leftSide.addPoint(530,410);
       leftSide.addPoint(490,380);
       g.setColor(new Color(0,255,0));
       g.fillPolygon(leftSide);
       g.setColor(new Color(255,255,0));
       g.fillRect(440,330,50,50);
       g.setColor(new Color(255,0,0));
       g.fillRect(480,370,50,50);
       g.setColor(new Color(0,0,255));
       g.fillPolygon(rightSide);
       
    }
        
}



    
 