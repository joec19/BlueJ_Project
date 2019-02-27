import java.awt.*;

public class Tip extends Aspect{
    Point A;Point B;Point C;
    Point tipA, tipB, tipC;
    int yPoint;
    double slopePos, slopeNeg;
    int[] x,y;
    
    public Tip(Head head, Color color){
        super(head.getPoly(),color);
        A = head.getPoints()[0];
        B = head.getPoints()[1];
        C = head.getPoints()[2];
        
        slopeNeg = (A.getY()-C.getY())/(A.getX()-C.getX());
        slopePos = (B.getY()-C.getY())/(B.getX()-C.getX());
        yPoint = (int)(((C.getY()+A.getY())/3)+A.getY());
        
        tipA = new Point((int)((yPoint-A.getY())/slopePos+A.getX()),yPoint);
        tipB = new Point((int)((yPoint-B.getY())/slopeNeg+B.getX()),yPoint);
        tipC = C;
        
        x = new int[]{(int)tipA.getX(),(int)tipB.getX(),(int)tipC.getX()};
        y = new int[]{(int)tipA.getY(),(int)tipB.getY(),(int)tipC.getY()};
        Polygon poly = new Polygon(x,y,3);
        this.alter(poly);
    }
}
