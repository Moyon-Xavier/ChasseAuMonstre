package fr.univlille.k2sae3a.Character;

import javafx.stage.Stage;

public abstract class Player extends Stage {
    private static int numAuto = 0;
    protected final int playerNumber;
    protected String name;
    protected String surname;

    protected Player(String name, String surname) {
        Player.numAuto += 1;
        playerNumber = numAuto;
        this.name = name;
        this.surname = surname;
    }

    protected Player(String name) {
        this(name, "Desrumeaux");
    }

    protected Player() {
        this("Illies");
    }
}
