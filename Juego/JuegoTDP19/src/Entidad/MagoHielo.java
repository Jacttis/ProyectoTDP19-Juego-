package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import FabricaDisparos.FabricaDisparo;

public class MagoHielo extends Aliado {

	public MagoHielo(Point pos, int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
		super(pos, vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);
		
		width=102;
		height=120;
		
		imagen[0] = new ImageIcon("C:\\Users\\crist\\Documents\\GitHub\\ProyectoTDP19\\Juego\\JuegoTDP19\\src\\Sprites\\CharacterSprites\\GIFs\\attackTRUE.gif");
	}

	
	/**
	 * Genera un disparo y lo retorna
	 * 
	 */
	
	public Disparo disparar() {
		
		if(puedeDisparar)
		
			return new DisparoMagoHielo(new Point(this.pos.x,this.pos.y+65),12,damage);
		
		else return null;
	}
	
	
	
	
	


}
