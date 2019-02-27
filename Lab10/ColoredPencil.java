import java.awt.*;
import java.util.*;
public class ColoredPencil extends Pencil{
    private Point topLeft;
    private int width, height, tlx, tly;

    public ColoredPencil(Point topLeft, int width, Color color){
        super(topLeft, width);
        this.topLeft = topLeft;
        this.width = width;
        this.height = width*15;
        tlx = (int)topLeft.getX();
        tly = (int)topLeft.getY();

        obj[0].alter(color);
        obj[1].alter(color);
        obj[2].alter(color);
    }
}
