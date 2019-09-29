package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Estados.Atacando;
import FabricaDisparos.FabricaDisparo;


public class ArqueroHumano extends Aliado {

	public ArqueroHumano( int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
		super(vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);
		
		width=100;
		height=120;

		imagen[0] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");
		imagen[1] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");
		imagen[2] = new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/aaaH.gif");

	}

	
	/**
	 * Genera un disparo y lo retorna para que fabrica de disparos
	 * lo inserte en el mapa
	 * 
	 */
	
	public Disparo disparar() {
		
		if(puedeDisparar)
		
			return new DisparoArqueroHumano(new Point(this.pos.x+30,this.pos.y+50),15,damage);
		
		else return null;
	}




	public void posicionar(Point posicionNueva){
		this.pos=new Point(posicionNueva.x,posicionNueva.y+15);

	}
	
	
	
	
	
	
}
