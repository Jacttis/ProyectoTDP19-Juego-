package Entidad;

import java.awt.*;
import java.util.LinkedList;

import Estados.*;
import FabricaDisparos.FabricaDisparo;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Juego.Mapa;

import javax.swing.*;

public abstract class Personaje extends Entidad {

	protected int vidaActual,vidaTotal;
	protected float velocidadAtaque;
	protected boolean puedeAtacar;
	protected JLabel etiquetaVida;
	protected FabricaDisparo fabricaDisparo;
	protected int rango;
	protected Estado estado;



	/**
	 * Crea el personaje
	 * 
	 * @param pos
	 * @param vida
	 * @param damage
	 * @param velocidadAtaque
	 * @param rango
	 */

	public Personaje(Point pos, int vida, int damage, float velocidadAtaque,int rango,double velocidad) {
		super(pos,velocidad,damage);
		vidaActual=vidaTotal=vida;
		this.velocidadAtaque = velocidadAtaque;
		estado=new EstadoNulo(this);
		puedeAtacar=true;
		this.rango=rango;

		imagen =new ImageIcon[4];

	}


	// Getters


	public FabricaDisparo getFabricaDisparo(){
		return fabricaDisparo;
	}

	/**
	 * @return Retorna la vida del personaje
	 */
	public int getVida() {
		return vidaActual;
	}

	public int getVidaTotal(){
		return vidaTotal;
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
		if((vidaActual-cantidad)<0) {
			vidaActual = 0;
			this.actualizarGraficos();
		}
		else {
			vidaActual-=cantidad;
			this.actualizarGraficos();
		}
	}

	/**
	 * Actualiza la entidad mediante el estado.
	 *
	 */

	public void actualizarEntidad() {
		estado.verificarEstado();
		estado.actuar();
		colisionadorCombate.verificarColisionando();
	}




	public Estado getEstado(){
		return estado;
	}

	public void setEstado(Estado estadoNuevo){
		estado=estadoNuevo;
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

	/**
	 * Devuelve verdadero si el personaje tiene 0 de vida
	 * o falso si el personaje tiene mas que 0 de vida.
	 *
	 * @return boolean
	 */

	public boolean estaMuerto(){
		if(vidaActual<=0)
			vidaActual=0;
		return vidaActual==0;
	}

	/**
	 * setters y getter de Puede atacar, el cual determina si
	 * el personaje puede atacar en ese momento.
	 *
	 */

	/**
	 * Setter del atributo puedeAtacar que determina si el personaje
	 * puede atacar, el cual varia segun la velicidadDeAtaque del personaje
	 * (en FabricaDeDisparos se hace uso mediante el hilo)
	 *
	 * @param puede
	 */

	public void setPuedeAtacar(boolean puede) {
		puedeAtacar=puede;
	}

	/**
	 * Retorna el atributo puedeAtacar
	 *
	 * @return boolean puedeAtacar
	 */

	public boolean puedeAtacar() {
		return puedeAtacar;
	}

	/**
	 * Redefinicion del eliminarse mas general
	 * Se elimina mediante el comando elimimnarPersonaje ubicado en Mapa.
	 *
	 */

	public void eliminarse(){
		Mapa.getMapa().eliminarEntidad(this);
		System.out.println("Eliminarse personaje");
	}


	public Rectangle getRangoCombate() {
		Rectangle hitBox=this.getHitBox();
		hitBox.width=hitBox.width+rango;
		hitBox.setLocation(hitBox.x-(hitBox.width/2),hitBox.y);

		return hitBox;
	}


}
