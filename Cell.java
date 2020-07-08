public class Cell {

    int nearbyMines;
    boolean mine;
    boolean revealed = false;
    String symbol = " ";

    public Cell() {

    }

    public String CellSymbol() {
        if (revealed == false)
            symbol = "*";
        else if (mine == true) {
            symbol = "M";
        } else if (nearbyMines == 0) {
            symbol = " ";
        } else {
            symbol = String.valueOf(nearbyMines);
        }
        return symbol;
    }

    public boolean hasMine() {
        return mine;
    }

    public boolean isEmpty() {
        if (nearbyMines == 0)
            return true;
        else
            return false;
    }

    public void revealCell() {
        revealed = true;
    }

}