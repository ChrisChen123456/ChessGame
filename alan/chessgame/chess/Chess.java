package alan.chessgame.chess;

import alan.chessgame.*;

public abstract class Chess
{
    
    public abstract Coordinate2Range getValidMove();
    
    public abstract ChessType getType();
}
