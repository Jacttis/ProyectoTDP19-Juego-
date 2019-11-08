package FabricaDisparos;

import Entidad.*;
import Juego.Mapa;
import java.awt.Point;
public abstract class FabricaDisparo {

	protected HiloPrueba hiloPuedeAtacar;

	/**
	 * Metodo abstracto que sera definido depende de cada tipo de fabrica.
	 * Recibe un Personaje 'disparador' como prametro para generar el disparo.
	 *
	 * @param disparador
	 */

	public abstract void generarDisparo(Personaje disparador);





}
