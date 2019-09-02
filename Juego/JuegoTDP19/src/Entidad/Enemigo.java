package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;

public abstract class Enemigo extends Personaje{
	
	protected int velocidad;
	protected int puntos;
	
	public Enemigo(int velocidad,int puntos, Point pos,int vida,int damage, int width, int height,float velocidadAtaque,Inteligencia IA) {
		super(pos,vida,damage,width,height,velocidadAtaque,IA);
		this.velocidad=velocidad;
		this.puntos=puntos;
		
		imagen=new ImageIcon [2];
		
	}

	protected abstract int getOro();
	protected abstract int getPuntos();

}