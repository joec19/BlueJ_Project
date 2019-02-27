import java.awt.*;

public class Implement {
    public void construct(Graphics g, Aspect[] obj){
        for(int i=0;i<obj.length;i++){
            if(obj[i]!=null){obj[i].draw(g);}
        }
    }
}
