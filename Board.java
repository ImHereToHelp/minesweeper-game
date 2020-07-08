import java.util.Random;

public class Board {

    Cell cells[][];
    Random random = new Random();
    int rows;
    int columns;
    int mines;
    int minedCells[];

    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        cells = new Cell[rows][columns];
        this.minedCells = new int[mines];
    }

    public void InitializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                cells[i][j] = new Cell();

            }
        }
    }

    public void AssignMines() {

        for (int i = 0; i < mines; i++) {
            int num = random.nextInt(rows * columns);
            minedCells[i] = num;
            if (cells[num / rows][num % columns].mine == true) {
                i--;
                continue;
            } else {
                cells[num / rows][num % columns].mine = true;
            }
        }
    }

    public void AssignCells() {

        int[] dx = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
        int[] dy = { 1, 1, 1, 0, 0, 0, -1, -1, -1 };
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                Cell currentCell = cells[x][y];
                currentCell.nearbyMines = 0;
                for (int d = 0; d < 9; d++) {
                    int neighborX = dx[d] + x;
                    int neighborY = dy[d] + y;

                    if (neighborX < 0 || neighborX >= rows || neighborY < 0 || neighborY >= columns) {
                        continue;
                    }

                    Cell neighborCell = cells[neighborX][neighborY];

                    if (neighborCell.hasMine()) {
                        currentCell.nearbyMines++;
                    }
                }
            }
        }
    }

    public void DrawBoard() {

        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < columns; j++) {

                String symbol = cells[i][j].CellSymbol();
                System.out.print("|" + symbol + "|");

            }
        }
    }

    public void SelectCell(int x, int y) {
        if (cells[x - 1][y - 1].hasMine()) {
            System.out.println("BOOM");
        } else if (cells[x - 1][y - 1].isEmpty()) {
            // RevealAdjacentEmptyCells(x-1,y-1);
        }
        cells[x - 1][y - 1].revealCell();

    }

    public void RevealAdjacentEmptyCells(int x, int y) {
        int dx = 0;
        int dy = 0;
        while (true) {

        }

    }
}