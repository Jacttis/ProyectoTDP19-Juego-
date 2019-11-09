package Entidad.Disparos;

import java.awt.Point;

import javax.swing.ImageIcon;

import Entidad.*;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoMagoHielo extends Disparo {


	/**
	 * Crea un DisparoMagoHielo.
	 *
	 * Asigna los atributos correspondientes.
	 *
	 * Inicializa el atributo IA como una nueva Inteligencia InteligenciaDisparoAliado
	 * con este mismo DisparoMagoHielo parametrizado.
	 *
	 * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad para
	 * luego agregarlo a la lista de graficos componentesGraficas.
	 *
	 * @param pos
	 * @param velocidad
	 * @param damage
	 * @param disparador
	 */
	
	public DisparoMagoHielo(Point pos, double velocidad, int damage, Personaje disparador) {
		super(pos, velocidad, damage, disparador);
		IA=new InteligenciaDisparoAliado(this);

		width=60;
		height=50;
		
		imagen[0]=new ImageIcon("src/Sprites/CharacterSprites/GIFs/MagoHielo/dMagoHielo.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,-3);
		componentesGraficas.agregarNuevoGrafico(sprites);
		
	}
	
	
}
