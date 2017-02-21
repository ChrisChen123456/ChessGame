package alan.chessgame;


/**
 * Write a description of class Coordinate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordinate2
{
    private final static int hashStart = 9876547;
    
    public Coordinate2(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public final int x;
    public final int y;
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Coordinate2) {
            Coordinate2 coord = (Coordinate2) obj;
            if(coord.x != x) return false;
            else if(coord.y != y) return false;
            else return true;
        }else return false;
    }
    
    @Override
    public int hashCode(){
        int hash = hashStart;
        hash = (hash<<4)^(hash>>28)^x;
        hash = (hash<<4)^(hash>>28)^y;
        return hash;
    }
}
