package Entidad;
import java.awt.*;

import javax.swing.ImageIcon;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorEnemigo;
import ColisionadoresCombate.ColCombateEnemigo;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.PowerUp.MagiaTemporal;
import Entidad.PowerUp.ObjetoPrecioso;
import Entidad.PowerUp.PowerUp;
import Estados.Atacando;
import Estados.Caminando;
import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaEnemigos;
import Juego.Mapa;
import Tienda.Tienda;

public abstract class Enemigo extends Personaje{
	
	
	protected int puntos;
	protected int oroPremio;
	protected PowerUp [] premios;
	
	/**
	 * Crea un personaje enemigo
	 * @param vida 
	 * @param damage 
	 * @param velocidadAtaque
	 * @param velocidad
	 * @param puntos
	 */
	public Enemigo(int vida,int damage, float velocidadAtaque,int rango,double velocidad,int puntos, int oro) {
		super(new Point(0,0),vida,damage,velocidadAtaque,rango,velocidad);
		IA=new InteligenciaEnemigos(this);
		this.velocidad=velocidad;
		oroPremio=oro;
		this.puntos=puntos;
		imagen=new ImageIcon [3];
		estado=new Caminando(this);

		colisionador=new ColisionadorEnemigo(this);
		colisionadorCombate=new ColCombateEnemigo(this);

		premios=new PowerUp[2];
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

	public void serDetectado(ColisionadorCombate colisionadorCombate){
		colisionadorCombate.detectoEnemigo(this);
	}

	/**
	 * Redefinicion del eliminarse mas general.
	 *
	 * Se agrega que al eliminarse aumente el oro de la tienda correspondientemente.
	 *
	 */

	public void eliminarse(){

		Mapa.getMapa().eliminarEntidad(this);


		Tienda.getTienda().aumentarOro(this.getOro());
		Tienda.getTienda().aumentarPuntos(this.getPuntos());
	}

	public void agregarMagiaTemporal(MagiaTemporal magia){
		if(premios[0]==null)
			premios[0]=magia;
	}

	public void agregarObjetoPrecioso(ObjetoPrecioso objeto){
		if(premios[1]==null)
			premios[1]=objeto;
	}


}