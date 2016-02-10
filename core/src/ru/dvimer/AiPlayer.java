package ru.dvimer;

import java.io.IOException;

/**
 * Created by Алексей on 04.02.2016.
 */
public class AiPlayer extends Player{

    public AiPlayer() {
    }

    public AiPlayer(GameField gameField) {
        super(gameField);
    }
//
//    public AiPlayer(GameField curentGameField) {
//        this.curentGameField = curentGameField;
//    }

    @Override


    public void hod()  {
//        curentGameField.pole[Maint.random.nextInt(10)][Maint.random.nextInt(10)] = '0';
        System.out.println("Ход компа");
    }

}
