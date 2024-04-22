package fr.univlille.k2sae3a.model.maze;

public class Cell implements ICellEvent {
    private boolean isShot;
    private CellInfo state;
    private int turn;
    private ICoordinate coord;


    public Cell(ICoordinate i, CellInfo state) {
        this.isShot = false;
        this.state = state;
        this.coord = i;
    }
    public int getTurn() {
        return turn;
    }
    
    public CellInfo getState() {
        return this.state;
    }

    public ICoordinate getCoord() {
        return this.coord;
    }
}