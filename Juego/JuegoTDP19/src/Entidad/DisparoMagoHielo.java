package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Inteligencia.InteligenciaDisparoAliado;

public class DisparoMagoHielo extends Disparo {

	
	
	
	public DisparoMagoHielo(Point pos, int velocidad, int damage) {
		super(pos, velocidad, damage);
		IA=new InteligenciaDisparoAliado(this);
		
		width=60;
		height=60;
		
		imagen[0]=new ImageIcon("C:\\Users\\crist\\Documents\\GitHub\\ProyectoTDP19\\Juego\\JuegoTDP19\\src\\Sprites\\CharacterSprites\\GIFs\\DisparoMagoHielo.png");
	
		
	}
	
	
	
}
