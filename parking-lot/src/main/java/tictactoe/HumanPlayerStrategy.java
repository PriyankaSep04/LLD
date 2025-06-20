package tictactoe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy{

    private Scanner scanner;
    private String playerName;

    public HumanPlayerStrategy(String playerName){
        this.scanner = new Scanner(System.in);
        this.playerName = playerName;
    }

    public Position makeMove(Board board){
        while (true) {
            System.out.printf("%s please provide your move (row and column):", playerName);
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                Position move = new Position(row,col);
                if(board.isValidMove(move)){
                    return move;
                }
                else {
                    System.out.println("Invalid move. Try again.");
                }
            }
        }

    }

