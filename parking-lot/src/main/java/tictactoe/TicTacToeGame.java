package tictactoe;

public class TicTacToeGame implements BoardGame{

    private Board board;

    private Player playerX;

    private Player playerO;

    private Player currentPlayer;

    private GameContext gameContext;

    public TicTacToeGame(PlayerStrategy xStrategy, PlayerStrategy oStrategy,int rows,int cols){
        board = new Board(rows,cols);
        playerX = new Player(Symbol.X,xStrategy);
        playerO = new Player(Symbol.O,oStrategy);
        currentPlayer = playerX; // can be set to playerO as well
        gameContext = new GameContext();
    }
    public void play(){
        do{
            board.printBoard();
            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move,currentPlayer.getSymbol());
            board.checkGameState(gameContext,currentPlayer);
            switchPlayer();
        }while (!gameContext.isGameOver());
        announceResult();
    }

    private void switchPlayer(){
        currentPlayer=currentPlayer == playerX ? playerO : playerX;
    }

    private void announceResult(){
        GameState state = gameContext.getCurrentState();
        board.printBoard();
        if(state instanceof  XWonState){
            System.out.println("Player X wins!");
        }
        else if(state instanceof  OWonState){
            System.out.println("Player O wins!");
        }
        else{
            System.out.println("Tie");
        }
    }
}
