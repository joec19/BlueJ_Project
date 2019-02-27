import java.awt.*;

public class Aspect {
    private Rectangle rectangle;
    private Polygon tri;
    private Color color;
    public Aspect(Rectangle rectangle,Color color){
        this.rectangle = rectangle;
        this.color = color;
    }
    
    public Aspect(Polygon tri,Color color){
        this.tri = tri;
        this.color = color;
    }
    
    public void alter(Rectangle rectangle){
        this.rectangle = rectangle;
    }
    
    public void alter(Polygon tri){
        this.tri = tri;
    }
    
    public void alter(Color color){
        this.color = color;
    }
    
    public void draw(Graphics g){
        g.setColor(color);
        if(rectangle==null){g.fillPolygon(tri);}
        else{g.fillRect(
            (int)rectangle.getX(),
            (int)rectangle.getY(),
            (int)rectangle.getWidth(),
            (int)rectangle.getHeight()
            );
        }
    }
}
