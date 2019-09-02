package Entidades;
import java.awt.*;

import Inteligencia.Inteligencia;

public abstract class Enemigo extends Personaje{
	
	protected int Velocidad;
	protected int Puntos;
	
	public Enemigo(int Velocidad,int Puntos, Point pos,int vida,int damage, int width, int height,float velocidadAtaque,Inteligencia IA) {
		super(pos,vida,damage,width,height,velocidadAtaque,IA);
		this.Velocidad=Velocidad;
		this.Puntos=Puntos;
		
		
	}

	protected abstract int getOro();
	protected abstract int getPuntos();

}