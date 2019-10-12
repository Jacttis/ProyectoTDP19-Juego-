package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorEnemigo;
import Estados.Atacando;
import Estados.Caminando;
import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaEnemigos;

public abstract class Enemigo extends Personaje{
	
	
	protected int puntos;
	
	/**
	 * Crea un personaje enemigo
	 * @param vida 
	 * @param damage 
	 * @param velocidadAtaque
	 * @param velocidad
	 * @param puntos
	 */
	public Enemigo(int vida,int damage, float velocidadAtaque,int velocidad,int puntos) {
		super(new Point(0,0),vida,damage,velocidadAtaque,velocidad);
		IA=new InteligenciaEnemigos(this);
		this.velocidad=velocidad;
		this.puntos=puntos;
		imagen=new ImageIcon [3];
		estado=new Caminando(this);
		colisionador=new ColisionadorEnemigo(this);
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

	public void noColisiona(){
		estado.cambiarACaminando();
	}


}