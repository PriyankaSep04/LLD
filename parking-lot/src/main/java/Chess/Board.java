package Chess;

public class Board {
    private static Board instance;
    private Cell[][] board;

    private Board(int rows){
        initializeBoard(rows);
    }

    public static Board getInstance(int rows){
        if(instance == null){
            instance=new Board(rows);
        }
        return instance;
    }

    private void initializeBoard(int rows){
        board= new Cell[rows][rows];
        setPieceRow(0,true);
        setPawnRow(1,true);
        setPieceRow(rows-1,false);
        setPawnRow(rows-2,false);
        for(int i=2;i<rows-2;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=new Cell(i,j,null);
            }
        }

    }

    private void setPieceRow(int row,boolean isWhite){
        board[row][0]=new Cell(row,0,PieceFactory.createPiece("Rook",isWhite));
        board[row][1]=new Cell(row,1,PieceFactory.createPiece("Knight",isWhite));
        board[row][2]=new Cell(row,2,PieceFactory.createPiece("Bishop",isWhite));
        board[row][3]=new Cell(row,3,PieceFactory.createPiece("Queen",isWhite));
        board[row][4]=new Cell(row,4,PieceFactory.createPiece("King",isWhite));
        board[row][5]=new Cell(row,5,PieceFactory.createPiece("Bishop",isWhite));
        board[row][6]=new Cell(row,6,PieceFactory.createPiece("Knight",isWhite));
        board[row][7]=new Cell(row,7,PieceFactory.createPiece("Rook",isWhite));
    }

    private void setPawnRow(int row,boolean isWhite){
        for(int j=0;j<board.length;j++){
            board[row][j]= new Cell(row,j,PieceFactory.createPiece("Pawn",isWhite));
        }
    }

    public Cell getCell(int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return board[row][col];
        }
        return null;
    }
}
