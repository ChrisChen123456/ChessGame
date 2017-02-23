package alan.chessgame;

import java.util.List;


public interface Coordinate2Range {
    public boolean isInRange(Coordinate2 coord);
    
    /**
     * Methods below throws ArithmeticException when the coordinate is in infinity.
     */
    public List<Coordinate2> getValidCoords() throws ArithmeticException;
    
    public Coordinate2 getLowest() throws ArithmeticException;
    
    public Coordinate2 getHighest() throws ArithmeticException;
    
    public boolean isInfinite();
}
