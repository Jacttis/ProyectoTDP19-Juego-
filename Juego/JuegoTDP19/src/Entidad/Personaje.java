package Entidad;

import java.awt.*;

import Estados.*;
import FabricaDisparos.FabricaDisparo;
import Inteligencia.Inteligencia;
import Juego.Mapa;

import javax.swing.*;

public abstract class Personaje extends Entidad {

	protected int vida;
	protected float velocidadAtaque;
	protected boolean puedeAtacar;
	protected JLabel etiquetaVida;


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

	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);

		}

		return this.grafico;
	}

	public void cambiarGrafico(int dir) {
		if(this.grafico!=null) {
			this.grafico.setIcon(this.imagen[dir]);
			this.grafico.setBounds(this.pos.x,this.pos.y,width,height);
			actualizarEtiquetaVida(0);

		}
	}

	/**
	 * Si no tiene todavia etiqueta vida la crea.
	 *
	 * Retorna el JLabel de la barra de vida del personaje.
	 *
	 * @return JLabel etiquetaVida
	 */

	public JLabel getEtiquetaVida(){
		if(this.etiquetaVida==null){
			this.etiquetaVida=new JLabel();
			this.etiquetaVida.setBounds(pos.x,pos.y+this.height,80,5);
			this.etiquetaVida.setOpaque(true);
			this.etiquetaVida.setBackground(Color.GREEN);
		}

		return etiquetaVida;
	}

	/**
	 * Actualiza la etiquetaVida tanto como la posicion segun el personaje, como
	 * su estado segun la vida del personaje.
	 *
	 * @param n
	 */

	public void actualizarEtiquetaVida(int n){

		if(etiquetaVida!=null) {
			etiquetaVida.setBounds(pos.x+this.width, pos.y+this.height , (etiquetaVida.getWidth()-((n*80)/100)), etiquetaVida.getHeight());

			if (vida < 70) {
				if (vida < 40)
					etiquetaVida.setBackground(Color.RED);
				else etiquetaVida.setBackground(Color.YELLOW);
			}
		}
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
		if((vida-cantidad)<0) {
			vida = 0;
			actualizarEtiquetaVida(etiquetaVida.getWidth());
		}
		else {
			vida-=cantidad;
			this.actualizarEtiquetaVida(cantidad);
		}
	}

	/**
	 * Actualiza la entidad mediante el estado.
	 *
	 */

	public void actualizarEntidad() {
		estado.actuar();
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

	/**
	 * Devuelve verdadero si el personaje tiene 0 de vida
	 * o falso si el personaje tiene mas que 0 de vida.
	 *
	 * @return boolean
	 */

	public boolean estaMuerto(){
		if(vida<=0)
			vida=0;
		return vida==0;
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
		Mapa.getMapa().eliminarPersonaje(this);
		System.out.println("Eliminarse personaje");
	}


}
