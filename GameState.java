public class GameState{
    
    int rows;
    int columns;
    int mines;
    Board board;

    public GameState(int rows, int columns, int mines){
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
    }

    public GameState(){
        
    }


    public void NewGamePrompt(){
        System.out.println("***Welcome to Minesweeper***\n*****************************");
        System.out.println("Enter the board size and number of mines in the form of: Row(4:20) Col(4:20) Mines(1:size-10)");
    }

    
}