package Chess;

public class King extends Piece{

    King(boolean isWhitePiece){
        super(isWhitePiece,new KingMovementStrategy());
    }

    public boolean canMove(Board board,Cell startCell,Cell endCell){
        return super.canMove(board,startCell,endCell);
    }
}
