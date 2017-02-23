package alan.chessgame.visualizer;

import alan.chessgame.chess.Chess;
import alan.chessgame.*;

import java.util.Map;


public interface UpdatableVisualizer {
    public void updateChessboard(Map<Coordinate2D, Chess> chessboard);
    
    public void updateSelection(Coordinate2D coord);
    
    public void updateSide(Side side);
    
    public void updateGameover(Side side);
}
