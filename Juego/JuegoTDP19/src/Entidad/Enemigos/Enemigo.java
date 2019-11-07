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

		Random r = new Random();
		int posibilidadCaer = r.nextInt(8);

		if(!powers.isEmpty()) {
			for(PowerUp power : powers)
				power.caerEnMapa(pos);

		}

		if(posibilidadCaer<=2)
			Tienda.getTienda().aumentarOro(1);
		else
			if(posibilidadCaer<=5)
				Tienda.getTienda().aumentarOro(this.getOro()/2);
			else
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




	public void agregarPowerUp(PowerUp power){
		powers.add(power);
		power.afectarPortador(this);
	}

}