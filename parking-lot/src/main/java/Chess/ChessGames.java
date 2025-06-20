package Chess;

import java.util.Scanner;

public class ChessGames {
    private Board board;
    private Player player1;
    private Player player2;
    private boolean isWhiteTurn;
    private Status status;

    public ChessGames(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.board = Board.getInstance(8);
        this.isWhiteTurn = true;
        this.status = Status.ACTIVE;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while(this.status == Status.ACTIVE){
            Player currentPlayer = isWhiteTurn ? player1 : player2;
            System.out.print("Enter source row and column (e.g., 6 4): ");
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();

            // Ask for destination coordinates
            System.out.print("Enter destination row and column (e.g., 4 4): ");
            int endRow = scanner.nextInt();
            int endCol = scanner.nextInt();
            Cell startCell = board.getCell(startRow, startCol);
            Cell endCell = board.getCell(endRow, endCol);
            if (startCell == null || startCell.getPiece() == null) {
                System.out.println("Invalid move: No piece at source cell.");
                continue;
            }
            // Make the move
            makeMove(new Move(startCell, endCell), currentPlayer);
        }

        System.out.println("Game Over! Status: " + this.status);

    }

    public void makeMove(Move move, Player player) {
        // Initial check for a valid move
        // To check if source and destination don't contain the same color pieces
        if (move.isValid()) {
            Piece sourcePiece = move.getStartCell().getPiece();
            // Check if the source piece can be moved or not
            if (sourcePiece.canMove(this.board, move.getStartCell(), move.getEndCell())) {
                Piece destinationPiece = move.getEndCell().getPiece();
                // Check if the destination cell contains some piece
                if (destinationPiece != null) {
                    // If the destination cell contains King and currently white is
                    // playing --> White wins
                    if (destinationPiece instanceof King && isWhiteTurn) {
                        this.status = Status.WHITE_WIN;
                        return;
                    }
                    // If the destination cell contains King and currently Black is
                    // playing --> Black wins
                    if (destinationPiece instanceof King && !isWhiteTurn) {
                        this.status = Status.BLACK_WIN;
                        return;
                    }
                    // Set the destination piece as killed
                    destinationPiece.setKilled(true);
                }
                // Adding the valid move to the game logs
                // Moving the source piece to the destination cell
                move.getEndCell().setPiece(sourcePiece);
                // Setting the source cell to null (means it doesn't have any piece)
                move.getStartCell().setPiece(null);
                // Toggling the turn
                this.isWhiteTurn = !isWhiteTurn;
                System.out.println(isWhiteTurn);
            }
        }
    }
}
