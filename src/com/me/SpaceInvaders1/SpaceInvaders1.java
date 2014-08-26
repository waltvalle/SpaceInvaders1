// AYUDA OBTENIDA DE DOS INGENIEROS

package com.me.SpaceInvaders1;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL10;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class SpaceInvaders1 implements ApplicationListener {

//	se crean las clases stage y image y todas las variables estaticas que tendra el proyecto
	Stage stage;
	Image image;
	static Izquierda Izquierda;
	static Derecha Derecha;
	static Alien1 Alien1;
	static Alien2 Alien2;
	static Alien3 Alien3;
	static Proyectil proyectil;
	static Nave nave;
	

	
	@Override
	public void create()
//	aqui se inicializan y se instancian todas las variables utilizadas en todo el proyecto
	{	
		stage = new Stage();
		image = new Image(new Texture(Gdx.files.internal("data/fondo.png")));
		stage.addActor(image);
		proyectil = new Proyectil();
		nave = new Nave(proyectil);
		stage.addActor(nave);
		stage.addActor(proyectil);
		stage.addActor(new Izquierda(nave, proyectil));
		stage.addActor(new Derecha(nave, proyectil));
		stage.addActor(new Alien1());
		stage.addActor(new Alien2());
		stage.addActor(new Alien3());
		
		Gdx.input.setInputProcessor(stage);
	}


	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//		se corre el draw y el act en el metodo render
		stage.draw();
		stage.act();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
