package com.me.SpaceInvaders1;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.me.SpaceInvaders1.Nave;

//ListenerDerecha hereda de ClickListener
public class ListenerDerecha extends ClickListener 
{
//	establezco las variables que utilizare en seguida	
	Nave MoverObjetoNave;
	public float MoverNave = 35;
	Proyectil Moverproyectil;

//	listener derecha obtendra como parametro la clase Nave y Proyectil
	ListenerDerecha(Nave ObjetoNave, Proyectil proyectil)
	{
		this.MoverObjetoNave = ObjetoNave;
		this.Moverproyectil = proyectil;
	}


	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		super.touchDown(event, x, y, pointer, button);
//		creo una condicion que ejecuta un movimiento de la nave junto con el proyectil con ciertos limites asi no se pasa de la flecha
		if (MoverObjetoNave.getX() < 950)
			MoverObjetoNave.setX(MoverObjetoNave.getX() + MoverNave);
		if (Moverproyectil.getX() < 1010)
			Moverproyectil.setX(Moverproyectil.getX() + MoverNave);
//		los sets y gets permiten el movimiento de estos objetos restando la variables MoverNave a la posicion en la que este	
 		return true;
	}
}