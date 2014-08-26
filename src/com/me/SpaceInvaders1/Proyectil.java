package com.me.SpaceInvaders1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Proyectil extends Image
{
//	creo las variables que voy a utilizar en seguida
	public float PosX = 615;
	public float PosY = 0;
	public float Movimiento = 5;

	Proyectil()
	{
//		con el super inicializo una textura o imagen png		
		super(new Texture("data/proyectil.png"));
//		set y get de posicion en X y en Y
		this.setX(PosX);
		this.setY(PosY);
		
	}
	
	public void act()
	{
//		contador que como limite sea > 100
		for (int i = 0; i < 100; i++) 
		{
			// el set de Y toma la posicion que tiene el proyectil en ese momento y le suma Movimiento
		    setY(getY() + Movimiento);
	}
//		condicion que atrapa el objeto de modo que si llega hasta >720 regrese a la posicion inicial
		if (getY()>720)
			setY(0);
		
	}
}
