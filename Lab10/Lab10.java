import java.awt.*;
import java.applet.*;
import java.util.*; 

public class Lab10 extends Applet{
    public void paint(Graphics g){
        int x = 50;
        int y = 50;
        int width = 30;
        
        int cX = 100;
        int cY = 50;
        int cWidth = 20;
        int R = 50;
        int G = 200;
        int B = 100;
        

        
        Pencil pencil = new Pencil(new Point(x,y),width);
        ColoredPencil coloredPencil = new ColoredPencil(new Point(cX,cY),width,new Color(R,G,B));
        
        pencil.assemble();
        pencil.construct(g, pencil.getBlueprint());
        
        coloredPencil.assemble();
        coloredPencil.construct(g, coloredPencil.getBlueprint());
    }
}
