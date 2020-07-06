public class Cell{

    int numMines;
    boolean mine;
    boolean revealed;
    String symbol;

    public String CellSymbol(){
        if(revealed)
            return "M";
        else
            return " ";
    }
    
}