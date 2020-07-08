import java.util.Scanner;

public class GameState {

    int rows;
    int columns;
    int mines;
    String[] inputData = new String[3];
    String input;
    Scanner scanner = new Scanner(System.in);
    Board board;
    boolean lostGame = false;

    public GameState(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
    }

    public GameState() {

    }

    public void StartNewGame() {
        System.out.println("***Welcome to Minesweeper***\n****************************");
        System.out.println(
                "Enter the board size and number of mines in the form of: Row(4:20) Col(4:20) Mines(1:size-10)");
        input = scanner.nextLine();
        inputData = input.split(" ");
        rows = Integer.parseInt(inputData[0]);
        columns = Integer.parseInt(inputData[1]);
        mines = Integer.parseInt(inputData[2]);
    }

    public void NewTurn() {
        System.out.println("\nEnter which square you want to reveal: ");
        input = scanner.nextLine();
        inputData = input.split(" ");
        board.SelectCell(Integer.parseInt(inputData[0]), Integer.parseInt(inputData[1]));
        board.DrawBoard();

    }

    public void InitializeGame() {
        board.InitializeBoard();
        board.AssignMines();
        board.AssignCells();
    }

}