package ru.dvimer;

/**
 * Created by Алексей on 04.02.2016.
 */
public abstract class Player {

    GameField gameField;

    public Player() {
    }

    public Player(GameField gameField) {
        this.gameField = gameField;
    }

    public abstract void hod();
}
