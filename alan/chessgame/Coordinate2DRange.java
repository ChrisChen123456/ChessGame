package alan.chessgame;

import java.util.List;


public interface Coordinate2DRange {
    public boolean isInRange(Coordinate2D coord);
    
    /**
     * Methods below throws ArithmeticException when the coordinate is in infinity.
     */
    public List<Coordinate2D> getValidCoords() throws ArithmeticException;
    
    public Coordinate2D getLowest() throws ArithmeticException;
    
    public Coordinate2D getHighest() throws ArithmeticException;
    
    public boolean isInfinite();
}
