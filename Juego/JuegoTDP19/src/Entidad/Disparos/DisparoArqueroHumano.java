package Entidad.Disparos;

import java.awt.*;

import javax.swing.ImageIcon;

import Entidad.*;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoArqueroHumano extends Disparo {

	public DisparoArqueroHumano(Point pos, double velocidad, int damage, Personaje disparador) {
		super(pos, velocidad, damage, disparador);
		IA=new InteligenciaDisparoAliado(this);
		
		width=100;
		height=38;
		
		imagen[0]=new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/DisparoArqueroTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		componentesGraficas.agregarNuevoGrafico(sprites);
	
		
	}

	public Entidad clone(){
		return new DisparoArqueroHumano(pos,velocidad,damage,disparador);
	}

	public Rectangle getHitBox(){
		return new Rectangle(pos.x,pos.y,width-30,height-20);
	}

}
