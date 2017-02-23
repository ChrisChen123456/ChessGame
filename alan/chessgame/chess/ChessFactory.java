package alan.chessgame.chess;


public final class ChessFactory {
    public static Chess newChess(ChessType type, Side side) {
        if(type == ChessType.PAWN) {
            return new Pawn(side);
        } else if(type == ChessType.KING) {
            return new King(side);
        } else if(type == ChessType.QUEEN) {
            return new Queen(side);
        } else if(type == ChessType.KNIGHT) {
            return new Knight(side);
        } else if(type == ChessType.ROOK) {
            return new Rook(side);
        } else if(type == ChessType.BISHOP) {
            return new Bishop(side);
        }
    }
    
    private ChessFactory() {}
}
