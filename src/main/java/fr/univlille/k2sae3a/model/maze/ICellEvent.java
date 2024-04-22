package fr.univlille.k2sae3a.model.maze;

public interface ICellEvent {
    public CellInfo getState();
    public int getTurn();
    public ICoordinate getCoord();

    public enum CellInfo {
        EMPTY,WALL,MONSTER,HUNTER,EXIT;
    }
}