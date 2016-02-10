package ru.dvimer;

import com.badlogic.gdx.Gdx;

/**
 * Created by Алексей on 08.02.2016.
 */
public class InputHendler {

    public static int getMouseX(){
        return Gdx.input.getX();
    }

    public static int getMouseY(){
        return Gdx.graphics.getHeight()- Gdx.input.getY();
    }

    public static boolean isClicked(){
        return Gdx.input.justTouched();
    }
}
