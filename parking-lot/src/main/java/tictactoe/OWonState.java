package tictactoe;

public class OWonState implements GameState{

    public void next(GameContext gameContext,Player player,boolean hasWon){
        //no new state
    }

    public boolean isGameOver(){
        return true;
    }


}
