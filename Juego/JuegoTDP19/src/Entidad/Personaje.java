package Entidad;

import java.awt.*;

import Estados.*;
import FabricaDisparos.FabricaDisparo;
import Inteligencia.Inteligencia;
import Juego.Mapa;

public abstract class Personaje extends Entidad {

	protected int vida;
	protected float velocidadAtaque;
	protected boolean puedeAtacar;


	

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
		puedeAtacar=true;
		
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

	public void disminuirVida(int cantidad){
		if((vida-cantidad)<0)
			vida=0;
		else vida-=cantidad;
	}

	/**
	 * Actualiza la entidad mediante el estado.
	 *
	 */

	public void actualizarEntidad() {
		estado.actuar();
	}


	public boolean estaMuerto(){
		return vida<=0;
	}

	public void setVida(int n){
		vida=n;
	}

	/**
	 * setter y getter de estado.
	 * @param estado
	 */

	public void setEstado(Estado estado){
		this.estado=estado;
	}

	public Estado getEstado(){
		return estado;
	}

	/**
	 * Utiliza la fabrica de disparos para generar un disparo y
	 * que lo meta en el mapa.
	 *
	 */

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



	public boolean getSerEliminado(){
		if(vida<=0)
			serEliminado=true;
		return serEliminado;
	}

	/**
	 * setters y getter de Puede atacar, el cual determina si
	 * el personaje puede atacar en ese momento.
	 *
	 */

	public void setPuedeAtacar(boolean puede) {
		puedeAtacar=puede;
	}

	public boolean puedeAtacar() {
		return puedeAtacar;
	}


}
