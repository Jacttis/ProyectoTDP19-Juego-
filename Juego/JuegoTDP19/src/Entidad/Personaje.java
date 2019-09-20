package Entidad;

import java.awt.*;


import Estados.Estado;
import Estados.Quieto;

import FabricaDisparos.FabricaDisparo;
import Inteligencia.Inteligencia;

public abstract class Personaje extends Entidad {

	protected int vida;
	protected float velocidadAtaque;
	

	// protected Premio objetos [];

	/**
	 * Crea el personaje
	 * 
	 * @param pos
	 * @param vida
	 * @param damage
	 * @param velocidadAtaque
	 */

	public Personaje(Point pos, int vida, int damage, float velocidadAtaque,int velocidad) {
		super(pos,velocidad,damage);
		this.vida = vida;
		
		this.velocidadAtaque = velocidadAtaque;
		
	}
	// Getters

	/**
	 * @return Retorna la vida del personaje
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * 
	 * @return Retorna el damage del personaje
	 */
	public int getDamage() {
		return damage;

	}
	/**
	 * 
	 * @return retorn la velocidad de ataque del personaje
	 */
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}


}
