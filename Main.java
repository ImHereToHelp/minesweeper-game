import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameState game = new GameState();
        game.StartNewGame();
        Board board = new Board(game.rows, game.columns, game.mines);
        game.board = board;
        game.InitializeGame();
        game.board.DrawBoard();
        while (true) {
            game.NewTurn();
        }
    }

}