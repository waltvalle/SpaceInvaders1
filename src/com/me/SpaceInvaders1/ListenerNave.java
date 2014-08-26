package com.me.SpaceInvaders1;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.me.SpaceInvaders1.Nave;

//ListenerNave hereda de ClickListener
public class ListenerNave extends ClickListener
{
//	creo dos variables que usare en seguida
	Nave MiNave;
	Proyectil FuegoProyectil;
	
//	Listener nave tendra como parametros la clase Nave y Proyectil
	ListenerNave(Nave ObjetoNave, Proyectil proyectil)
	{
//		asigno las variables ObjetoNave y proyectil igualandolas a las declaradas anteriormente 
		this.MiNave = ObjetoNave;
		this.FuegoProyectil = proyectil;
	}

//	funcion dada por el Ing. Ahmed Castro
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		super.touchDown(event, x, y, pointer, button);
		System.out.println("FUEGOOOO!!!");
		
//		FuegoProyectil accede a la funcion act de la clase Proyectil
		FuegoProyectil.act();
		
		return true;
	}
}