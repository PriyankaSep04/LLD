package tictactoe;

public class Player {
    Symbol symbol;
    PlayerStrategy playerStrategy;

    Player(Symbol symbol,PlayerStrategy playerStrategy){
        this.symbol = symbol;
        this.playerStrategy=playerStrategy;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }
}
