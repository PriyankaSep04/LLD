package tictactoe;

public class Board {

    int rows;
    int cols;
    Symbol[][] grid;

    public  Board (int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        grid=new Symbol[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                grid[i][j]= Symbol.Empty;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j].equals(Symbol.Empty) ? "-" : grid[i][j]); // Use '-' for empty cells
                if (j < 2) System.out.print(" | "); // Add separators between columns
            }
            System.out.println();
            if (i < 2) System.out.println("---------"); // Add separators between rows
        }
    }

    boolean isValidMove(Position move){
        return(move.row>=0 && move.row<rows && move.col>=0 && move.col<cols && grid[move.row][move.col]==Symbol.Empty);
    }

    public void makeMove(Position move,Symbol symbol){
        grid[move.row][move.col]=symbol;
    }

    private boolean isWinningLine(Symbol[] line){
        Symbol first = line[0];
        for(Symbol s:line){
            if(s!=first){
                return false;
            }
        }
        return true;
    }

    public void checkGameState(GameContext gameContext,Player currentPlayer){
        for(int i=0;i<rows;i++){
            if(grid[i][0]!=Symbol.Empty && isWinningLine(grid[i])){
                gameContext.next(currentPlayer,true);
                return;
            }
        }

        for(int i=0;i<cols;i++){
            Symbol[] column = new Symbol[rows];
            for(int j=0;j<rows;j++){
                column[j]=grid[j][i];
            }
            if(column[0]!=Symbol.Empty && isWinningLine(column)){
                gameContext.next(currentPlayer,true);
                return;
            }
        }
    }

}
