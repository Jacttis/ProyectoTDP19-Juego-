package Entidad.Disparos;

import java.awt.*;

import javax.swing.ImageIcon;

import Entidad.*;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoArqueroHumano extends Disparo {

	/**
	 * Crea un DisparoArqueroHumano.
	 *
	 * Asigna los atributos correspondientes.
	 *
	 * Inicializa el atributo IA como una nueva Inteligencia InteligenciaDisparoAliado
	 * con este mismo DisparoArqueroHumano parametrizado.
	 *
	 * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
	 * luego agregarlo a la lista de graficos componentesGraficas.
	 *
	 * @param pos
	 * @param velocidad
	 * @param damage
	 * @param disparador
	 */

	public DisparoArqueroHumano(Point pos, double velocidad, int damage, Personaje disparador) {
		super(pos, velocidad, damage, disparador);
		IA=new InteligenciaDisparoAliado(this);
		
		width=100;
		height=38;
		
		imagen[0]=new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/DisparoArqueroTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		componentesGraficas.agregarNuevoGrafico(sprites);
	
		
	}

	/**
	 * Redefinicion del getHitbox mas general
	 *
	 * Devuelve un rectangulo que reprensenta el hitbox del Disparo.
	 *
	 * @return Rectangle
	 */

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-20);
	}

}
