package Entidad.Aliados;

import java.awt.*;

import javax.swing.*;

import Constantes.Constantes;
import FabricaDisparos.FabricaDisparoArquero;
import Graficos.TiposGrafico.BarraDeVida;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Tienda.ParCelda;


public class ArqueroHumano extends Aliado {

	/**
	 * Inicializa un ArqueroHumano con sus correspondientes atributos y utilizando el constructor mas general
	 * de Personaje.
	 *
	 * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad y BarraDeVida para
	 * luego agregarlos a la lista de graficos componentesGraficas.
	 *
	 * Tambien le asigna un mouseListener al Grafico Sprites.
	 *
	 * @param vida
	 * @param damage
	 * @param velocidadAtaque
	 * @param rango
	 * @param velocidad
	 * @param Descripcion
	 */

	public ArqueroHumano( int vida, int damage, float velocidadAtaque,int rango, double velocidad, String Descripcion) {
		super(vida, damage, velocidadAtaque, rango, velocidad, Descripcion);
		
		width= Constantes.ALIADOX;
		height=Constantes.ALIADOY;

		precio=5;

		imagen[0] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/quietoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/atacandoTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/muerteTRUE.gif");
		imagen[3] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/quietoTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		Grafico barraVida=new BarraDeVida(this,5,0);

		sprites.getGrafico().addMouseListener(new MouseOyenteAliado(this));

		componentesGraficas.agregarGrafico(sprites);
		componentesGraficas.agregarGrafico(barraVida);

	}



	/**
	 *
	 * Implementacion del metodo abstracto atacar ubicado en Personaje.
	 *
	 * Si puede atacar genera un disparo mediante la fabrica de Disparos la cual lo insertara en el mapa.
	 *
	 */
	
	public void atacar() {
		
		if(puedeAtacar)
			FabricaDisparoArquero.getFabricaDisparoArquero().generarDisparo(this);

	}


	/**
	 * Redefinicion del posicionar mas general.
	 * Lo posicion mas exactamente en base al sprite del Aliado.
	 * @param celda
	 */

	public void posicionar(ParCelda celda){
		super.posicionar(celda);
		pos.setLocation(celda.getPos().x,celda.getPos().y+15);

	}

	/**
	 * Redefinicion del getHitbox mas general
	 *
	 * Devuelve un rectangulo que reprensenta el hitbox del Aliado.
	 *
	 * @return Rectangle
	 */

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-50);
	}
	
	
	
	
	
	
}
