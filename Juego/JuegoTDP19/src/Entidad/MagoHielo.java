package Entidad;

import java.awt.*;

import javax.swing.*;

import Constantes.Constantes;
import FabricaDisparos.FabricaDisparo;
import FabricaDisparos.FabricaDisparoMagoHielo;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

public class MagoHielo extends Aliado {

	public MagoHielo(int vida, int damage, float velocidadAtaque,int rango, String Descripcion) {
		super(vida, damage, velocidadAtaque, rango, Descripcion);
		
		width= Constantes.ALIADOX;
		height=Constantes.ALIADOY;

		fabricaDisparo=new FabricaDisparoMagoHielo(this);

		imagen[0] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[3] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		Grafico barraVida=new BarraDeVida(this,8,0);
		listaGraficos.add(barraVida);
		listaGraficos.add(sprites);

	}



	/**
	 * Utiliza la fabrica de disparos para generar un disparo y
	 * que lo meta en el mapa.
	 * 
	 */
	
	public void atacar() {
		
		if(puedeAtacar)
		
			fabricaDisparo.generarDisparo();

	}

	public void posicionar(Point posicionNueva){
		this.pos=new Point(posicionNueva.x,posicionNueva.y+15);

	}

	public Entidad clone(){
		return new MagoHielo(vidaTotal,damage,velocidadAtaque,rango,descripcion);
	}


	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-70);
	}



}
