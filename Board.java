import java.util.Random;

public class Board{
    
    Cell cells[][];
    Random random;
    int rows;
    int columns;
    int mines;
    int minedCells[];

    public Board(int rows, int columns, int mines){
        this.rows = rows;
        this.columns = columns;
        cells = new Cell[rows][columns];
        this.minedCells = new int[mines];
    }

    public void AssignMines(){

        for(int i = 0; i<mines; i++){
            minedCells[i] = this.random.nextInt(rows*columns);
            cells[minedCells[i]/rows][minedCells[i]%columns].mine = true;
        }
    }

    public void DrawBoard(){

        for(int i = 0; i<rows+2; i++){
			System.out.print("\n");
			for(int j = 0; j<columns+2; j++){
				if(i == 0 || i == rows+1){
                    System.out.print("__");
                }
				else if(j == 0 || j == columns+1){
					System.out.print("|");
				}else{
					System.out.print(cells[i/rows][j%columns].CellSymbol()+"|");
				}
			}
		}
    }

}