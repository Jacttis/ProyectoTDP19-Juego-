package Entidades;
import java.awt.*;

public abstract class Enemigo extends Personaje{
	
	protected int Velocidad;
	protected int Puntos;
	
	public Enemigo(     int Velocidad,int Puntos) {
		
		this.Velocidad=Velocidad;
		this.Puntos=Puntos;
		
		
	}

	protected abstract int getOro();
	protected abstract int getPuntos();

}