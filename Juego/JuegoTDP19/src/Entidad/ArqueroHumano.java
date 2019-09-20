package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import FabricaDisparos.FabricaDisparo;


public class ArqueroHumano extends Aliado {

	public ArqueroHumano( int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
		super(vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);
		
		width=100;
		height=120;
		
		imagen[0] = new ImageIcon("Sprites/craftpix-392011-2d-fantasy-elf-free-sprite-sheets/Archer1GIF/aaaH.gif");
	}

	
	/**
	 * Genera un disparo y lo retorna
	 * 
	 */
	
	public Disparo disparar() {
		
		if(puedeDisparar)
		
			return new DisparoArqueroHumano(new Point(this.pos.x,this.pos.y+65),15,damage);
		
		else return null;
	}
	
	
	
	
	
	
	
	
	
}
