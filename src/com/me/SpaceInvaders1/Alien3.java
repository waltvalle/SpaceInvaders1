package com.me.SpaceInvaders1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

//Alien3 hereda de Image 
public class Alien3 extends Image 
{
//	establezco las variables que utilizare en seguida
	public boolean toleft = false; // esta servira como bandera
	public float PosX = 500;
	public float PosY = 400;
	public float Movimiento = 7;
	public boolean UnaVez = true; // esta servira como bandera

//	creo el metodo alien3
	Alien3()
	{
//		el super inicializa la textura
		super(new Texture("data/alien3.png"));
		this.setY(PosY);
	}
	
	public void act(float delta)
	{
//		aqui esta el codigo que hace que el alien vaya de derecha a izquierda
//		si UnaVez esta en true, se convierte en false desde un inicio
		if (UnaVez == true)
		  UnaVez = false;
		else
//			si esta condicion no se cumple la posicion en X sera la que tenga el objeto en ese momento
			PosX = getX();
//		si toleft esta en true...
		if (toleft == true) 
		{
//			se ejecuta el setX que es la posicion del objeto - el movimiento establecido
		  setX(PosX - Movimiento);
//		  si la posicion en X es menor o igual a 50 toleft sera a falsa
		  if (PosX <= 50)
			toleft = false;
		}
//		si nada de esto se cumple...
		else 
		{
//			se ejecuta el movimiento que hace un setX que es la posicion del objeto + el movimiento establecido 
		  setX(PosX + Movimiento);
//		  si la posicion en X sobrepasa 950 el toleft se pasa a true
		  if (PosX >= 950)
			toleft = true;
		}
	}
}