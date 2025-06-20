package tictactoe;

public class XTurnState implements GameState{

    public void next(GameContext gameContext,Player player,boolean hasWon){
        if(hasWon){
            gameContext.setState(player.symbol==Symbol.X?new XWonState():new OWonState());
        }
        else{
            gameContext.setState(new OTurnState());
        }

    }

    public boolean isGameOver(){
        return false;
    }
}
