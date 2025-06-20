package Chess;

public class Bishop extends Piece{

    Bishop(boolean isWhitePiece){
        super(isWhitePiece,new BishopMovementStrategy());
    }

    public boolean canMove(Board board,Cell startCell,Cell endCell){
        return super.canMove(board,startCell,endCell);
    }
}
