package Chess;

public class Knight extends Piece {

    Knight(boolean isWhitePiece){
        super(isWhitePiece,new KnightMovementStrategy());
    }

    public boolean canMove(Board board,Cell startCell,Cell endCell){
        return super.canMove(board,startCell,endCell);
    }
}
