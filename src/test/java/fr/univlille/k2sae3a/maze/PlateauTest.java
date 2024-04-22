package fr.univlille.k2sae3a.maze;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import fr.univlille.k2sae3a.model.maze.Plateau;

public class PlateauTest{
    int parameterx;
    int parametery;
    Plateau pl;
    Plateau plWithParameter;
    @BeforeEach
    public void init() throws Exception{
        parameterx=5;
        parametery=3;
        pl = new Plateau();
        plWithParameter = new Plateau(parameterx,parametery);
    }

    @Test
    public void le_plateau_est_créé_avec_les_bonnes_dimensions(){
        assertEquals(pl.cellules.length,Plateau.DEFAULT_SIZE);
        for (int i = 0 ; i<pl.cellules.length;i++){
            assertEquals(pl.cellules[i].length,Plateau.DEFAULT_SIZE);
        }
        assertEquals(plWithParameter.cellules.length,parameterx);
        for (int i = 0 ; i<plWithParameter.cellules.length;i++){
            assertEquals(plWithParameter.cellules[i].length,parametery);
        }
        
    }


}