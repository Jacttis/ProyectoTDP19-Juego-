package Entidad;


import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;

public class EnemigoGolemHielo extends Enemigo {

	public EnemigoGolemHielo(Point pos,int vida,int damage, int width, int height,float velocidadAtaque,Inteligencia IA,int velocidad,int puntos) {
	
		super(pos,vida,damage,width,height,velocidadAtaque,IA,velocidad,puntos);
		imagen [0]=new ImageIcon("Sprites\\GolemHieloGIF\\aaa.gif");
		
	
	
	
	}

	@Override
	protected int getOro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getPuntos() {
		// TODO Auto-generated method stub
		return 0;
	}
}
