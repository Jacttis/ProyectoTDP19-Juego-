package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.InteligenciaDisparoAliado;

public class DisparoArqueroHumano extends Disparo {

	public DisparoArqueroHumano(Point pos, int velocidad, int damage) {
		super(pos, velocidad, damage);
		IA=new InteligenciaDisparoAliado(this);
		
		width=100;
		height=38;
		
		imagen[0]=new ImageIcon("Sprites/ArqueroHumano/Archer1GIF/DisparoArqueroTRUE.gif");
	
		
	}

	public Entidad clone(){
		return new DisparoArqueroHumano(pos,velocidad,damage);
	}

}
