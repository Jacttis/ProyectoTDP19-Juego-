package Entidad.Disparos;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorDisparo;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;

import java.awt.Point;

import javax.swing.ImageIcon;

public abstract class Disparo extends Entidad {

	protected Personaje disparador;
	
	public Disparo(Point pos, double velocidad, int damage, Personaje disparador) {
		
		super(pos,velocidad,damage);
		imagen=new ImageIcon [1];
		colisionador=new ColisionadorDisparo(this);
		this.disparador=disparador;
		
		
	}

	/**
	 * Afecta al personaje parametrizado disminuyendole la vida
	 * el valor del atributo damage.
	 *
	 * @param personajeAfectado
	 */

	public void afectarPersonaje(Personaje personajeAfectado){

		personajeAfectado.disminuirVida(this.damage);

	}

	/**
	 * Retorna el personaje que disparo a este Disparo.
	 *
	 * @return Personaje disparador
	 */

	public Personaje getDisparador(){
		return disparador;
	}

	/**
	 * Definicion del metodo abstracto serChocado mas general.
	 * Le envia al colisionador parametrizado el mensaje afectarDisparo
	 * con esta instancia disparo como parametro.
	 *
	 * @param colisionador
	 */

	public void serChocado(Colisionador colisionador){
		colisionador.afectarDisparo(this);
	}

	public void serDetectado(ColisionadorCombate colisionadorCombate){
		colisionadorCombate.detectoDisparo(this);
	}
}
