package Entidad.Aliados;

import java.awt.*;

import javax.swing.*;

import Constantes.Constantes;
import Entidad.Entidad;
import FabricaDisparos.FabricaDisparoArquero;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Tienda.ParCelda;


public class ArqueroHumano extends Aliado {

	public ArqueroHumano( int vida, int damage, float velocidadAtaque,int rango, double velocidad, String Descripcion) {
		super(vida, damage, velocidadAtaque, rango, velocidad, Descripcion);
		
		width= Constantes.ALIADOX;
		height=Constantes.ALIADOY;

		imagen[0] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/quietoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/atacandoTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/muerteTRUE.gif");
		imagen[3] = new ImageIcon("Sprites/CharacterSprites/GIFs/ArqueroHumano/quietoTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		Grafico barraVida=new BarraDeVida(this,5,0);

		componentesGraficas.agregarNuevoGrafico(sprites);
		componentesGraficas.agregarNuevoGrafico(barraVida);

		fabricaDisparo=new FabricaDisparoArquero(this);

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

			fabricaDisparo.generarDisparo();

	}


	/**
	 * Redefinicion del posicionar mas general.
	 *
	 * @param celda
	 */

	public void posicionar(ParCelda celda){
		super.posicionar(celda);
		pos.setLocation(celda.getPos().x,celda.getPos().y+15);

	}

	/**
	 * Implementacion del metodo abstracto clone en Entidad.
	 *
	 * Clona a la entidad y la devuelve.
	 *
	 * @return Entidad
	 */

	public Entidad clone(){
		return new ArqueroHumano(vidaTotal,damage,velocidadAtaque,rango, velocidad,descripcion);
	}

	/**
	 * Redefinicion del getHitbox mas general
	 *
	 * Devuelve un rectangulo que reprensenta el hitbox del personaje.
	 *
	 * @return Rectangle
	 */

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-70);
	}
	
	
	
	
	
	
}
