package Entidad.Enemigos;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadoresEnemigos.ColisionadorEnemigo;
import ColisionadoresCombate.ColCombateEnemigo;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Entidad.PowerUp.PowerUp;
import Estados.Caminando;
import Inteligencia.InteligenciaEnemigos;
import Juego.Mapa;
import Tienda.Tienda;

public abstract class Enemigo extends Personaje {
	
	
	protected int puntos;
	protected int oroPremio;
	protected LinkedList<PowerUp> powers;
	
	/**
	 * Crea un personaje enemigo
	 *
	 * Al atributo colisionador lo instancia como un nuevo ColisionadorEnemigo con
	 * este mismo enemigo parametrizado.
	 *
	 * Al atributo colisionadorCombate lo instancia como un nuevo ColCombateEnemigo con
	 * este mismo enemigo parametrizado.
	 *
	 * Al atributo IA lo instancia como un nuevo InteligenciaEnemigos con este mismo
	 * enemigo parametrizado.
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

		estado=new Caminando(this);

		powers=new LinkedList<PowerUp>();

		colisionador=new ColisionadorEnemigo(this);
		colisionadorCombate=new ColCombateEnemigo(this);

	}



	/**
	 * Retorna una cantidad de oro segun enemigo
	 */
	protected int getOro(){
		return oroPremio;
	}

	
	/**
	 * Devuelve la cantidad de puntos del enemigo
	 * @return Entero con la cantidad de puntos que da el enemigo
	 */
	public int getPuntos() {
		return puntos;
	}


	/**
	 *  Recibe un colisionador y a este mismo le manda el mensaje
	 *  afectarEnemigo con este mismo enemigo parametrizado.
	 *
	 * @param colisionador
	 */
	public void serChocado(Colisionador colisionador){
		colisionador.afectarEnemigo(this);
	}

	/**
	 *  Recibe un colisionadorCombate y a este mismo le manda el mensaje
	 *  detectoEnemigo con este mismo Enemigo parametrizado.
	 *
	 * @param colisionadorCombate
	 */

	public void serDetectado(ColisionadorCombate colisionadorCombate){
		colisionadorCombate.detectoEnemigo(this);
	}

	/**
	 * Redefinicion del eliminarse mas general.
	 *
	 * Se agrega que al eliminarse aumente el oro de la tienda correspondientemente.
	 * Si tiene un powerUp le envia el mensaje caerEnMapa con el atributo pos parametrizado.
	 *
	 */

	public void eliminarse(){

		Mapa.getMapa().eliminarEntidad(this);

		Random r = new Random();
		int posibilidadOroACaer = r.nextInt(8);

		if(!powers.isEmpty()) {
			for(PowerUp power : powers)
				power.caerEnMapa(pos);

		}

		Tienda.getTienda().aumentarOro(this.getOro());
		Tienda.getTienda().aumentarPuntos(this.getPuntos());
	}


	/**
	 * Redefinicion del getHitbox mas general.
	 *
	 * Devuelve un rectangulo que reprensenta el hitbox del personaje.
	 *
	 * @return Rectangle
	 */

	public Rectangle getHitBox(){
		return new Rectangle(pos.x+40,pos.y+10,width-30,height-70);
	}

	public Rectangle getRangoCombate() {
		Rectangle hitBox=this.getHitBox();
		hitBox.width=hitBox.width+rango;
		hitBox.setLocation(hitBox.x-rango,hitBox.y);

		return hitBox;
	}

	/**
	 * Agrega el PowerUp parametrizado a la lista de powers
	 * y envia al mismo el mensaje afectarPortador con este mismo Enemigo
	 * parametrizado.
	 *
	 * @param power
	 */


	public void agregarPowerUp(PowerUp power){
		powers.add(power);
		power.afectarPortador(this);
	}

}