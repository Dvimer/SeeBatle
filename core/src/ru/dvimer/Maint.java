package ru.dvimer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Maint extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture batle;
	int mouseX;
	int mouseY;
	int mouseCellX;
	int mouseCellY;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("FieldSee.png");
		batle = new Texture("Battle.bmp");

	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0.9f, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 180, 180);
		batch.draw(img, 570, 180);
//		batch.draw(batle, mouseX-15, mouseY -15);
		batch.draw(batle, mouseCellX, mouseCellY);

		batch.end();

	}


	public void update(){
		mouseX = Gdx.input.getX();
		mouseY = 768 - Gdx.input.getY();
		mouseCellX = mouseX - (mouseX% 30);
		mouseCellY = mouseY - (mouseY% 30);
//		if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
//			batch.draw(batle,mouseCellX,mouseCellY);
//		}
	}

}
