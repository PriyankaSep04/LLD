package tictactoe;

import java.awt.event.HierarchyBoundsAdapter;

public class PlayTicTacToe {
    public static void main(String[] args) {
        PlayerStrategy playerXStrategy = new HumanPlayerStrategy("X");
        PlayerStrategy playerOStrategy = new HumanPlayerStrategy("O");
        TicTacToeGame game = new TicTacToeGame(playerXStrategy,playerOStrategy,3,3);
        game.play();
    }
}
