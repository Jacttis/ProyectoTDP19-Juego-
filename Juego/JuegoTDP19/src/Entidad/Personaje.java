package Entidad;

import java.awt.*;

import Estados.*;
import FabricaDisparos.FabricaDisparo;
import Inteligencia.Inteligencia;
import Juego.Mapa;

public abstract class Personaje extends Entidad {

	protected int vida;
	protected float velocidadAtaque;
	protected Estado estado;

	

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
		estado=new EstadoNulo(this);
		
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

	public void actualizarEntidad() {
		estado.actuar();
	}

	public Estado getEstado(){
		return estado;
	}

	public void cambiarEstado(Estado nuevoEstado){
		estado=nuevoEstado;
	}

	public boolean estaMuerto(){
		return vida<=0;
	}

	public void setVida(int n){
		vida=n;
	}

	public void destruir(){
		vida=0;
	}

	public void setEstado(Estado estado){
		this.estado=estado;
	}

	public abstract void atacar();


	/**
	 * Recibe una posicion central de una celda y se ubica
	 * en esa celda.
	 *
	 * @param posicionNueva
	 */

	public void posicionar(Point posicionNueva){
		this.pos=posicionNueva;

	}

	public void eliminarse(){
		Mapa.getMapa().eliminarEntidad(this);

	}


}
