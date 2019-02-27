
public class End extends Implement{
    Aspect[] obj = new Aspect[2];
    public End(Head head, Tip tip){
        super();

        obj[0] = head;
        obj[1] = tip;
    }
    public Aspect[] getBlueprint(){return obj;}
}
