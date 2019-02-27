import java.awt.*;

public class Eraser extends Implement{
    private Aspect[] obj;
    public Eraser(Color color, Pencil pencil){
        obj=pencil.createEraser(color);
    }
    public Aspect[] getBlueprint(){return obj;}
}
