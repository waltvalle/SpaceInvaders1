package com.me.SpaceInvaders1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.me.SpaceInvaders1.Nave;

//Izquierda hereda de Image
public class Izquierda extends Image 
{
//	la clase Derecha recibe como parametros Nave y Proyectil
	public Izquierda(Nave ObjetoNave, Proyectil proyectil)
	{
//		se inicializa la textura
		super(new Texture("data/flechaizquierda.png"));
//		se  inicializa el listener derecha enviandole como parametro ObjetoNave y proyectil
		ListenerIzquierda mi_listenerizq = new ListenerIzquierda(ObjetoNave, proyectil);
        addListener(mi_listenerizq);
        this.setX(0);
	}
}
