package com.me.SpaceInvaders1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

//Derecha hereda de Image
public class Derecha extends Image 
{
//	la clase Derecha recibe como parametros Nave y Proyectil
	public Derecha(Nave ObjetoNave, Proyectil proyectil)
	{
//		se inicializa la textura
		super(new Texture("data/flechaDerecha.png"));
//		se  inicializa el listener derecha enviandole como parametro ObjetoNave y proyectil
		ListenerDerecha mi_listenerder = new ListenerDerecha(ObjetoNave, proyectil);
        addListener(mi_listenerder);
        this.setX(1150);
	}
}
