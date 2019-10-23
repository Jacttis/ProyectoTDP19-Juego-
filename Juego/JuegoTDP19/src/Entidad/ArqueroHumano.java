package Entidad;

import java.awt.*;

import javax.swing.*;

import Constantes.Constantes;
import Estados.Atacando;
import FabricaDisparos.FabricaDisparo;
import FabricaDisparos.FabricaDisparoArquero;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Tienda.ParCelda;


public class ArqueroHumano extends Aliado {

	public ArqueroHumano( int vida, int damage, float velocidadAtaque,int rango, String Descripcion) {
		super(vida, damage, velocidadAtaque, rango, Descripcion);
		
		width= Constantes.ALIADOX;
		height=Constantes.ALIADOY;

		imagen[0] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/atacandoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");
		imagen[2] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");
		imagen[3] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/quietoTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		Grafico barraVida=new BarraDeVida(this,5,0);
		listaGraficos.add(barraVida);
		listaGraficos.add(sprites);

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
		return new ArqueroHumano(vidaTotal,damage,velocidadAtaque,rango,descripcion);
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
