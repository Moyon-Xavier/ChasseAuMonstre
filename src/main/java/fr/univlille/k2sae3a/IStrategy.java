package fr.univlille.k2sae3a;

import fr.univlille.k2sae3a.model.maze.ICellEvent;
import fr.univlille.k2sae3a.model.maze.ICoordinate;

public interface IStrategy {
    public ICoordinate play();
    public void update(ICellEvent event);
}
