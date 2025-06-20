package tictactoe;

public class OTurnState implements  GameState{

    @Override
    public void next(GameContext gameContext,Player player,boolean hasWon){
        if(hasWon){
            gameContext.setState(player.symbol==Symbol.O?new OWonState():new XWonState());
        }
        else{
            gameContext.setState(new XTurnState());
        }

    }

    public boolean isGameOver(){
        return false;
    }

}
