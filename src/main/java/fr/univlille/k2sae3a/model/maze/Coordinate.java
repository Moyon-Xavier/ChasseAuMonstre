package fr.univlille.k2sae3a.model.maze;

public class Coordinate implements ICoordinate {
    private int row;
    private int col;

    public Coordinate(int x, int y) {
        this.row = x;
        this.row = y;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.col;
    }
}