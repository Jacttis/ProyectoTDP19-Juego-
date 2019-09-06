package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaEnemigos;

public abstract class Enemigo extends Personaje{
	
	
	protected int puntos;
	
	/**
	 * Crea un personaje enemigo
	 * @param pos 
	 * @param vida 
	 * @param damage 
	 * @param velocidadAtaque
	 * @param velocidad
	 * @param puntos
	 */
	public Enemigo( Point pos,int vida,int damage, float velocidadAtaque,double velocidad,int puntos) {
		super(pos,vida,damage,velocidadAtaque,velocidad);
		IA=new InteligenciaEnemigos(this);
		this.velocidad=velocidad;
		this.puntos=puntos;
		imagen=new ImageIcon [1];
	}
	/**
	 * Retorna una cantidad de oro segun enemigo
	 */
	protected abstract int getOro();
	
	//Getters triviales
	
	/**
	 * Devuelve la cantidad de puntos del enemigo
	 * @return Entero con la cantidad de puntos que da el enemigo
	 */
	protected  int getPuntos() {
		return puntos;
	}
	/**
	 * Devuelve la velocidad del enemigo
	 * @return Entero con la velocidad del enemigo
	 */
	

}