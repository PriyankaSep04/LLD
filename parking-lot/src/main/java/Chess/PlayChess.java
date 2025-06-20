package Chess;

public class PlayChess {

    public static void main(String[] args) {
        Player player1 = new Player("Player1", true); // White
        Player player2 = new Player("Player1", false);
        ChessGames chessGames = new ChessGames(player1,player2);
        chessGames.start();
    }
}
