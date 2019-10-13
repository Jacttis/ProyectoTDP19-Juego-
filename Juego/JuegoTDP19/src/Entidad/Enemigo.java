package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorEnemigo;
import Estados.Atacando;
import Estados.Caminando;
import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaEnemigos;
import Juego.Mapa;
import Tienda.Tienda;

public abstract class Enemigo extends Personaje{
	
	
	protected int puntos;
	protected int oroPremio;
	
	/**
	 * Crea un personaje enemigo
	 * @param vida 
	 * @param damage 
	 * @param velocidadAtaque
	 * @param velocidad
	 * @param puntos
	 */
	public Enemigo(int vida,int damage, float velocidadAtaque,int velocidad,int puntos, int oro) {
		super(new Point(0,0),vida,damage,velocidadAtaque,velocidad);
		IA=new InteligenciaEnemigos(this);
		this.velocidad=velocidad;
		oroPremio=oro;
		this.puntos=puntos;
		imagen=new ImageIcon [3];
		estado=new Caminando(this);
		colisionador=new ColisionadorEnemigo(this);
	}
	/**
	 * Retorna una cantidad de oro segun enemigo
	 */
	protected int getOro(){
		return oroPremio;
	}
	
	//Getters triviales
	
	/**
	 * Devuelve la cantidad de puntos del enemigo
	 * @return Entero con la cantidad de puntos que da el enemigo
	 */
	public int getPuntos() {
		return puntos;
	}


	/**
	 *  Recibe un colisionador y a este mismo le manda el mensaje
	 *  de que choco con un enemigo.
	 *
	 * @param colisionador
	 */
	public void serChocado(Colisionador colisionador){
		colisionador.afectarEnemigo(this);
	}

	/**
	 * Redefinicion del eliminarse mas general.
	 *
	 * Se agrega que al eliminarse aumente el oro de la tienda correspondientemente.
	 *
	 */

	public void eliminarse(){

		Mapa.getMapa().eliminarPersonaje(this);

		Tienda.getTienda().aumentarOro(this.getOro());
	}

}