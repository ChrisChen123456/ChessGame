package alan.chessgame;

import alan.chessgame.visualizer.UpdatableVisualizer;
import alan.chessgame.joystick.InputJoystick;
import alan.chessgame.chess.Chess;

import java.util.Map;

public final class ChessGame {
    
    private PlayerIO blackPlayer;
    private PlayerIO whitePlayer;
    
    private Chessboard chessboard;
    
    public ChessGame(PlayerIO blackPlayer, PlayerIO whitePlayer) {
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
    }
    
    public static void main(String[] args) {
        
        ChessGame game = new ChessGame(
                new PlayerIO(
                        new UpdatableVisualizer(){
                            @Override
                            public void updateChessboard(Map<Coordinate2D, Chess> chessboard) {
                                // TODO
                            }
                            
                            @Override
                            public void updateSelection(Coordinate2D coord) {
                                // TODO
                            }
                            
                            @Override
                            public void updateSide(Side side) {
                                // TODO
                            }
                            
                            @Override
                            public void updateGameover(Side side) {
                                // TODO
                            }
                        },
                        new InputJoystick(){
                            @Override
                            public Coordinate2D inputSelection() {
                                // TODO
                                return null;
                            }
                        }
                        ),
                new PlayerIO(
                        new UpdatableVisualizer(){
                            @Override
                            public void updateChessboard(Map<Coordinate2D, Chess> chessboard) {
                                // TODO
                            }
                            
                            @Override
                            public void updateSelection(Coordinate2D coord) {
                                // TODO
                            }
                            
                            @Override
                            public void updateSide(Side side) {
                                // TODO
                            }
                            
                            @Override
                            public void updateGameover(Side side) {
                                // TODO
                            }
                        },
                        new InputJoystick(){
                            @Override
                            public Coordinate2D inputSelection() {
                                // TODO
                                return null;
                            }
                        }
                        )
                );
        
    }
}
