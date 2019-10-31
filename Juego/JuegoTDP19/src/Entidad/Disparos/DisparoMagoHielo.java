package Entidad.Disparos;

import java.awt.Point;

import javax.swing.ImageIcon;

import Entidad.*;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoMagoHielo extends Disparo {

	protected double relantizacion;
	
	
	public DisparoMagoHielo(Point pos, double velocidad, int damage, Personaje disparador) {
		super(pos, velocidad, damage, disparador);
		IA=new InteligenciaDisparoAliado(this);

		relantizacion=1;

		width=45;
		height=45;
		
		imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/DisparoMagoHieloTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		componentesGraficas.agregarNuevoGrafico(sprites);
		
	}

	public void afectarPersonaje(Personaje personajeAfectado){

		personajeAfectado.disminuirVida(this.damage);

	}

	public Entidad clone(){
		return new DisparoMagoHielo(pos,velocidad,damage,disparador);
	}
	
	
	
}
