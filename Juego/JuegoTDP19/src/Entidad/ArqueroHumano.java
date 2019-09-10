package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import FabricaDisparos.FabricaDisparo;
import FabricaDisparos.FabricaDisparoAliado;


public class ArqueroHumano extends Aliado {

	public ArqueroHumano(Point pos, int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
		super(pos, vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);
		
		
		
		imagen[0] = new ImageIcon("Sprites\\craftpix-392011-2d-fantasy-elf-free-sprite-sheets\\Archer1GIF\\aaaH.gif");
	}

	
	/**
	 * Genera un disparo y lo retorna
	 * 
	 */
	
	public Disparo disparar() {
		
		return new DisparoArqueroHumano(new Point(this.pos.x,this.pos.y+50),15,damage);
	}
	
	
	
	
	
	
	
	
	
}
