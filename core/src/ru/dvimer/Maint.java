package ru.dvimer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class Maint extends ApplicationAdapter {

	public static Random random = new Random();
	SpriteBatch batch;
	GameField gf;
	GameField gf2;
	private static BitmapFont fnt;

	@Override
	public void create () {
		batch = new SpriteBatch();
		fnt = new BitmapFont(Gdx.files.internal("myfnt.fnt"));
		gf = new GameField(30,30);
		gf2 = new GameField(400,30);


	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0.9f, 0.8f, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		fnt.draw(batch, gf.setSelCellCoords(), 30, 20);
		fnt.draw(batch, gf2.setSelCellCoords(), 340, 20);
		fnt.draw(batch, "MORSKOY BOY", 40,400);
		gf.render(batch);
		gf2.render(batch);
		fnt.draw(batch, "Who?",InputHendler.getMouseX(),InputHendler.getMouseY());
		batch.end();

	}


	public void update(){
	}

}

