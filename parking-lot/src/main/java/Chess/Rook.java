package Chess;

public class Rook extends Piece{
    Rook(boolean isWhitePiece){
        super(isWhitePiece,new RookMovementStrategy());
    }

    public boolean canMove(Board board, Cell startCell, Cell endCell){
        return super.canMove(board,startCell,endCell);
    }
}
