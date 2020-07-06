import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){

        GameState game = new GameState();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Welcome to Minesweeper***\n*****************************");
        System.out.println("Enter the board size and number of mines in the form of: Row(4:20) Col(4:20) Mines(1:size-10)");
        String input = scanner.nextLine();
        String[] gameData = input.split(" ");
        int rows = Integer.parseInt(gameData[0]);
        int columns = Integer.parseInt(gameData[1]);
        int mines = Integer.parseInt(gameData[2]);

        Board board = new Board(rows,columns,mines);

        board.DrawBoard();
        

    }

}