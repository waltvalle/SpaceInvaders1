package com.me.SpaceInvaders1;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.me.SpaceInvaders1.Nave;

//ListenerIzquierda hereda de ClickListener
public class ListenerIzquierda extends ClickListener 
{
//	establezco las variables que utilizare en seguida
	Nave MoverObjetoNave;
	Proyectil MoverProyectil;
	public float MoverNave = 35;
	
//	listener izquierda obtendra como parametro la clase Nave y Proyectil
	ListenerIzquierda(Nave ObjetoNave, Proyectil proyectil)
	{
//		establezco que MoverObjetoNave y MoverProyectil seran igual a las variables declaradas en esta funcion
		this.MoverObjetoNave = ObjetoNave;
		this.MoverProyectil = proyectil;
	}

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
	
		super.touchDown(event, x, y, pointer, button);
//		creo una condicion que ejecuta un movimiento de la nave junto con el proyectil con ciertos limites asi no se pasa de la flecha
		if (MoverObjetoNave.getX() > 100)
			MoverObjetoNave.setX(MoverObjetoNave.getX() - MoverNave);
		if (MoverProyectil.getX() > 160)
			MoverProyectil.setX(MoverProyectil.getX() - MoverNave);
//		los sets y gets permiten el movimiento de estos objetos restando la variables MoverNave a la posicion en la que este
 		
 		return true;
	}
}