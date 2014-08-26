package com.me.SpaceInvaders1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

//se crea la clase Nave que se extiende de Image
public class Nave extends Image
{
//	Nave tendra como parametro Proyectil
	public Nave(Proyectil proyectil)
	{
//		se manda a llamar la textura
		super(new Texture("data/nave.png"));
//		se instancia el Listener que recibira la clase Nave (ListenerNave) y se inicializa enviandole como parametros a si misma y a proyectil
		ListenerNave mi_listenernave = new ListenerNave(this, proyectil);
		addListener(mi_listenernave);
		this.setX(540);
	}
}
