package ru.dvimer;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

/**
 * Created by Алексей on 04.02.2016.
 */
public class GameField {
    private final int FIELD_SIZE = 10;
    private final int CELL_SIZE = 30;
    private final int FIELD_SIZE_PIXELS = FIELD_SIZE * CELL_SIZE;

    private static Texture fieldTexture;
    private static Texture pointer;
    private static Texture cellTexture;

    Player human = new HumanP();
    Player ai = new AiPlayer();
    private int x;
    private int y;
    private int selCellX;
    private int selCellY;
    boolean hodX = true;
    char[][] pole;


    public GameField(int x, int y) {
        this.x = x;
        this.y = y;
        pole = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < 20; i++) {
            pole[Maint.random.nextInt(10)][Maint.random.nextInt(10)] = '*';
        }
        fieldTexture = new Texture("FullWater.png");
        pointer = new Texture("pointer.tga");
        cellTexture = new Texture("Cells.png");
    }

    public void render(SpriteBatch batch) {
        update();
        game();
        batch.draw(fieldTexture, x, y);
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (pole[i][j] == '*') {
                    batch.draw(cellTexture, x + i * 30, y + j * 30, 0, 0, 30, 30);
                }
                if (pole[i][j] == 'X') {
                    batch.draw(cellTexture, x + i * 30, y + j * 30, 30, 0, 30, 30);
                }
            }
        }
        if (selCellX > -1 && selCellY > -1) {
            batch.draw(pointer, x + selCellX * 30, y + selCellY * 30);
        }
    }

    public void update() {
        selCellX = (InputHendler.getMouseX() - x) / CELL_SIZE;
        selCellY = (InputHendler.getMouseY() - y) / CELL_SIZE;
        if (InputHendler.getMouseX() >= x + FIELD_SIZE_PIXELS || InputHendler.getMouseX() < x || InputHendler.getMouseY() >= y + FIELD_SIZE_PIXELS || InputHendler.getMouseY() < y) {
            selCellX = -1;
            selCellY = -1;
        }
//        if (InputHendler.isClicked() && selCellX > -1 && selCellY > -1) {
//            if (pole[selCellX][selCellY] == '*') {
//                pole[selCellX][selCellY] = 'X';
//            }
//        }
    }

    public boolean pobeda() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (pole[i][j] == '*') return false;
            }
        }
        return true;
    }


    {

    }

    public void game() {
        if (!pobeda() && InputHendler.isClicked() && selCellX > -1 && selCellY > -1) {
            if (pole[selCellX][selCellY] == '*') {
                pole[selCellX][selCellY] = 'X';
            }
        }
        if (pobeda()) {
            System.out.println("Победа");
        }
    }
//
//        if (!pobeda()) {
//            Player player = hodX ? human : ai;
//            player.hod();
//            if (pobeda()) {
//                System.out.println("Победа");
//            }
//            hodX = !hodX;
//        } else {
//            System.out.println("Конец игры");
//        }
//        }


    public String setSelCellCoords() {
        return (selCellX + 1) + " " + (selCellY + 1);
    }

    public int getFIELD_SIZE() {
        return FIELD_SIZE;
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }

    public int getFIELD_SIZE_PIXELS() {
        return FIELD_SIZE_PIXELS;
    }

    public int getSelCellX() {
        return selCellX;
    }

    public int getSelCellY() {
        return selCellY;
    }
}

