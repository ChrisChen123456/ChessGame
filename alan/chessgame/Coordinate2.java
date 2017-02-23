package alan.chessgame;

/**
 * Feel free to use this class as a key in HashMap
 */
public class Coordinate2 {
    private final static int hashStart = 0x1234ABCD;
    
    public Coordinate2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public final int x;
    public final int y;
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Coordinate2) {
            Coordinate2 coord = (Coordinate2) obj;
            if(coord.x != x) return false;
            else if(coord.y != y) return false;
            else return true;
        }else return false;
    }
    
    @Override
    public int hashCode() {
        int hash = hashStart;
        hash = (hash>>5)^(hash<<27)^x;
        hash = (hash>>5)^(hash<<27)^y;
        /* 
         * If you want to make it more like an unpredictable hash, remove the annotation
         * with remaining the code to make it compile.
        hash += hash<<13;
        hash ^= hash>>7;
        hash += hash<<3;
        hash ^= hash>>17;
        hash += hash<<5; */
        return hash;
    }
}
