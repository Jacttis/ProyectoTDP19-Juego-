package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.InteligenciaDisparoAliado;

public class DisparoArqueroHumano extends Disparo {

	public DisparoArqueroHumano(Point pos, int velocidad, int damage) {
		super(pos, velocidad, damage);
		IA=new InteligenciaDisparoAliado(this);
		
		width=150;
		height=50;
		
		imagen[0]=new ImageIcon("Sprites\\\\craftpix-392011-2d-fantasy-elf-free-sprite-sheets\\\\Arrow.png");
	
		
	}

}
