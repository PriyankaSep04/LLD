package Chess;

public class Cell {

    int row;
    int col;
    String label;
    Piece piece;
    public Cell(int row,int col,Piece piece){
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getRow() {
        return row;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}
