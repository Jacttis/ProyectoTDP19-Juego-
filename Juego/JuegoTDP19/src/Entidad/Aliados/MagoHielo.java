package Entidad.Aliados;

import java.awt.*;

import javax.swing.*;

import Constantes.Constantes;
import Entidad.Entidad;
import FabricaDisparos.FabricaDisparoMagoHielo;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

public class MagoHielo extends Aliado {

	public MagoHielo(int vida, int damage, float velocidadAtaque,int rango, double velocidad, String Descripcion) {
		super(vida, damage, velocidadAtaque, rango, velocidad, Descripcion);
		
		width= Constantes.ALIADOX;
		height=Constantes.ALIADOY;

		precio = 6;

		fabricaDisparo=new FabricaDisparoMagoHielo(this);

		imagen[0] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/stillTRUE.gif");
		imagen[1] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/attackTRUE.gif");
		imagen[2] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/muerteTRUE.gif");
		imagen[3] = new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/stillTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		Grafico barraVida=new BarraDeVida(this,8,0);

		sprites.getGrafico().addMouseListener(new MouseOyenteAliado(this));

		componentesGraficas.agregarGrafico(sprites);
		componentesGraficas.agregarGrafico(barraVida);

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
		return new MagoHielo(vidaTotal,damage,velocidadAtaque,rango,velocidad,descripcion);
	}


	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-50);
	}



}
