import java.awt.*;

public class Head extends Aspect{
    private Pencil pencil;
    private Polygon head;
    private Point A, B, C;

    public Head(Pencil pencil, Color color){
        super(pencil.createHead(),color);
        head = pencil.createHead();
        Point[] points = pencil.accessHead();
        A=points[0];
        B=points[1];
        C=points[2];
    }
    public Polygon getPoly(){
        return head;
    }
    public Point[] getPoints(){
        return new Point[]{A,B,C};
    }
}
