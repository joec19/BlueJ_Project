import java.awt.*;
import java.lang.*;
import java.util.*;

public class Pencil extends Implement{
    private Point topLeft;
    private int width, height;
    Aspect[] obj = new Aspect[20];
    int[] x, y;
    int tlx, tly;
    public Pencil(Point topLeft, int width){
        this.topLeft = topLeft;
        this.width = width;
        this.height = width*13;
        tlx = (int)topLeft.getX();
        tly = (int)topLeft.getY();

        obj[0] = new Aspect(new Rectangle(tlx,tly,width,height), 
                 new Color(255,178,71));
        obj[1] = new Aspect(new Rectangle(tlx,tly,width/4,height),
                 new Color(193,135,54));
        obj[2] = new Aspect(new Rectangle(tlx+width/4*3,tly,width/4, height),
                 new Color(193,135,54));
        
    }
    public void addImplement(Aspect[] blueprint){
        for(int i=0;i<obj.length-1;i++){
            if(obj[i]==null){
                for(int j=0;j<blueprint.length;j++){
                    obj[i+j]=blueprint[j];
                }
                break;
            }
        }
    }
    public Point getPoint(){return topLeft;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public Aspect[] getBlueprint(){return obj;}
    public Polygon createHead(){
        int px = (int)this.getPoint().getX();
        int py = (int)this.getPoint().getY();
        int pw = (int)this.getWidth();
        int ph = (int)this.getHeight();

        x = new int[]{px,px+pw/2,px+pw};
        y = new int[]{py,py-ph/8,py};
        
        Polygon poly = new Polygon(x,y,3);
        
        return poly;
    }
    public Point[] accessHead(){
        return new Point[]{new Point(x[0],y[0]),new Point(x[2],y[2]),new Point(x[1],y[2])};
    }
    public Aspect[] createEraser(Color color){
        int px = (int)this.getPoint().getX();
        int py = (int)this.getPoint().getY();
        int pw = (int)this.getWidth();
        int ph = (int)this.getHeight();
        
        Aspect[] eraser = new Aspect[]{
            new Aspect(new Rectangle(px,ph+py,pw,ph/8),color),
            new Aspect(new Rectangle(px,py+ph,pw,ph/14),Color.LIGHT_GRAY),
            new Aspect(new Rectangle(px,py+ph/40+ph,pw,ph/40),Color.GREEN)};

        
        return eraser;
    }
    public void assemble(){
        Eraser eraser = new Eraser(Color.PINK,this);
        End end = new End(new Head(this,new Color(242, 232, 186)), new Tip(new Head(this,new Color(242, 232, 186)), Color.GRAY));
        this.addImplement(eraser.getBlueprint());
        this.addImplement(end.getBlueprint());
    }
    
}
