package alan.chessgame.chess;

import alan.chessgame.*;

public abstract class Chess {
    
    public final Side side;
    
    public Chess(Side side) {
        this.side = side;
    }
    
    public abstract Coordinate2Range getValidMove(Coordinate2 selfCoord);
    
    public abstract ChessType getType();
}
