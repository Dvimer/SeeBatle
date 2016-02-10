package ru.dvimer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 04.02.2016.
 */
public class HumanP extends Player {

    public HumanP() {
    }

    public HumanP(GameField gameField) {
        super(gameField);
    }

    @Override
    public void hod() {

        if (!gameField.pobeda() && InputHendler.isClicked() && gameField.getSelCellX() > -1 && gameField.getSelCellY() > -1) {
            if (gameField.pole[gameField.getSelCellX()][gameField.getSelCellY()] == '*') {
                gameField.pole[gameField.getSelCellX()][gameField.getSelCellX()] = 'X';
            }
            System.out.println("ХОд человек");
        }
    }
}
