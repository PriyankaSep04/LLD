package Chess;

public abstract class Piece {

    private boolean isWhitePiece;
    private boolean killed = false;

    private MovementStrategy movementStrategy;

    public Piece(boolean isWhitePiece,MovementStrategy movementStrategy){
        this.isWhitePiece = isWhitePiece;
        this.movementStrategy = movementStrategy;
    }

    public boolean isWhitePiece() {
        return isWhitePiece;
    }

    public void setWhitePiece(boolean whitePiece) {
        isWhitePiece = whitePiece;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public MovementStrategy getMovementStrategy() {
        return movementStrategy;
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public boolean canMove(Board board,Cell startCell,Cell endCell){
        return movementStrategy.canMove(board,startCell,endCell);
    }
}
