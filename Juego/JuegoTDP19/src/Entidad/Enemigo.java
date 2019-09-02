package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaEnemigos;

public abstract class Enemigo extends Personaje{
	
	protected int velocidad;
	protected int puntos;
	protected int width=200,height=200;
	
	public Enemigo( Point pos,int vida,int damage, float velocidadAtaque,int velocidad,int puntos) {
		super(pos,vida,damage,velocidadAtaque);
		IA=new InteligenciaEnemigos(this);
		this.velocidad=velocidad;
		this.puntos=puntos;
		imagen=new ImageIcon [1];
	}
	/*
	 * retorna una cantidad de oro segun enemigo
	 */
	protected abstract int getOro();
	protected  int getPuntos() {
		return puntos;
	}

}