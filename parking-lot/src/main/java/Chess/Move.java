package Chess;

public class Move {
    private Cell startCell;
    private Cell endCell;
    public Move(Cell startCell,Cell endCell){
        this.startCell = startCell;
        this.endCell = endCell;
    }

    public boolean isValid(){
        if(endCell.piece==null) return true;
        else return !(startCell.piece.isWhitePiece() == endCell.piece.isWhitePiece());
    }

    public Cell getStartCell() {
        return startCell;
    }
    public Cell getEndCell() {
        return endCell;
    }
}
