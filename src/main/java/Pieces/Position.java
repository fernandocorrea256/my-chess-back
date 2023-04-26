package Pieces;

public class Position {
    private int row;
    private int col;

    Position(int row, int col) {
        if(row < 0) throw new IllegalArgumentException("Row cannot be negative");
        if(col < 0) throw new IllegalArgumentException("Col cannot be negative");

        if(row > 7) throw new IllegalArgumentException("Row cannot be bigger than 7");
        if(col > 7) throw new IllegalArgumentException("Col cannot be bigger than 7");

        this.row = row;
        this.col = col;
    }


    // setters & getters
    public int getRow() { return this.row; }
    public int getCol() { return this.col; }

    public void setRow(int row) { this.row = row; }
    public void setCol(int col) { this.col = col; }
}
