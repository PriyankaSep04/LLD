package tictactoe;


public class GameContext {
    private GameState currentState;

    public void setState(GameState state){
        this.currentState = state;
    }

    public GameState getCurrentState() {
        return currentState;
    }

    void next(Player player, boolean hasWon){
        currentState.next(this,player,hasWon);
    }

    public boolean isGameOver() {
        return currentState.isGameOver();
    }

    public GameContext() {
        currentState = new XTurnState(); // Start with X's turn
    }
}
