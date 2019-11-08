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
	protected int rango;
	protected Estado estado;



	/**
	 * Crea el personaje
	 *
	 * Inicializa el Personaje asignandole los datos parametrizados
	 * a sus atributos correspondientes y utilizando el contructo de Entidad (super)
	 * para los atributos pos, velocidad y damage.
	 *
	 * Inicializa el atributo estado como un nuevo estado Nulo con el mismo Personaje parametrizado.
	 *
	 * Inicializa el arreglo de imagenes (la cantidad de sprites distintos que tendra) como un
	 * arreglo de 4 componentes.
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


	/**
	 * Setters y Getters de los atributos.
	 */


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


	public Estado getEstado(){
		return estado;
	}

	public void setEstado(Estado estadoNuevo){
		estado=estadoNuevo;
	}


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
	 * Fin de setters y Getters
	 *
	 */


	/**
	 * Disminuye la vida del personaje el valor del entero parametrizado
	 * "cantidad".
	 *
	 * Si la vidaActual resultante es menor que 0, se le asigna el valor 0 a vidaActual sino se le resta
	 * el valor cantidad al atributo vidaActual.
	 * En cualquier caso se actualizan los graficos del Personaje.
	 *
	 * @param cantidad
	 */

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
	 * Actualiza el Personaje
	 *
	 * En este caso, se envia el mensaje verificarEstado a 'estado'
	 * luego se envia el mensaje actuar a 'estado'
	 * y por ultimo se envia el mensaje verificarColisionando a 'colisionadorCombate'.
	 *
	 */

	public void actualizarEntidad() {
		estado.verificarEstado();
		estado.actuar();
		colisionadorCombate.verificarColisionando();
	}



	/**
	 * Metodo abstracto atacar que cada tipo de personaje definira.
	 *
	 */

	public abstract void atacar();

	/**
	 * Redefinicion de getRangoCombate de Entidad
	 * Retorna un rectangle con las dimensiones (x,y,width + rango ,height) del Personaje
	 * y corrido para que este centrado en el Personaje.
	 *
	 * @return hitbox : Rectangle
	 */

	public Rectangle getRangoCombate() {
		Rectangle hitBox=this.getHitBox();
		hitBox.width=hitBox.width+rango;

		//Corrimiento para centrarlo
		hitBox.setLocation(hitBox.x-(hitBox.width/2),hitBox.y);

		return hitBox;
	}


}
