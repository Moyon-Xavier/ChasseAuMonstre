package fr.univlille.k2sae3a.Character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import fr.univlille.k2sae3a.model.maze.Plateau;

public class PlayerTest {

    Player p1;
    Player p2;
    Player p3;

    @BeforeEach
    public void init() {
        p1 = new Player();
        p2 = new Player("Ezcechiel");
        p3 = new Player("Lony", "Fauchois");
    }

}
