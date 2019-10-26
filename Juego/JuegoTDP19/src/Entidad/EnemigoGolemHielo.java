package Entidad;

import java.awt.*;
import javax.swing.*;

import Entidad.PowerUp.MagiaTemporal;
import FabricaDisparos.FabricaDisparoGolpeEnemigo;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;


public class EnemigoGolemHielo extends Enemigo {


	public EnemigoGolemHielo(int vida, int damage, float velocidadAtaque, int rango, double velocidad, int puntos, int oro) {

		super(vida, damage, velocidadAtaque, rango, velocidad, puntos, oro);

		fabricaDisparo=new FabricaDisparoGolpeEnemigo(this);

		imagen[0] = new ImageIcon("Sprites/Golems/GolemHieloGIF/CaminandoTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/Golems/GolemHieloGIF/AtacandoTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/Golems/GolemHieloGIF/ASDF.gif");
		imagen[3] = new ImageIcon("Sprites/Golems/GolemHieloGIF/ASDF.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		Grafico barraVida=new BarraDeVida(this,50,-10);
		componentesGraficas.agregarNuevoGrafico(sprites);
		componentesGraficas.agregarNuevoGrafico(barraVida);

	}




	/**
	 * Implementacion del metodo abstracto clone en Entidad.
	 *
	 * Clona a la entidad y la devuelve.
	 *
	 * @return Entidad
	 */

	public Entidad clone(){
		return new EnemigoGolemHielo(vidaTotal,damage,velocidadAtaque,rango,velocidad,puntos,oroPremio);
	}

	/**
	 *
	 * Implementacion del metodo abstracto atacar ubicado en Personaje.
	 * Si puede atacar genera un golpe mediante la fabrica de Disparos la cual lo insertara en el mapa.
	 *
	 */

	public void atacar(){

		if(puedeAtacar)
			fabricaDisparo.generarDisparo();
	}

	/**
	 * Redefinicion del getHitbox mas general.
	 *
	 * Devuelve un rectangulo que reprensenta el hitbox del personaje.
	 *
	 * @return Rectangle
	 */

	public Rectangle getHitBox(){
		return new Rectangle(pos.x+40,pos.y,width-30,height-70);
	}
}
