package Entidades;
import java.awt.*;

public abstract class Personaje extends Entidad {
	
	protected int vida,daño;
	protected float velocidadAtaque;
	protected String descripcion;
	protected Inteligencia IA;
	protected Premio objetos [];
	
	public Personaje(Point ubicacion,int vida,int daño,float velocidadAtaque,String descripcion,Inteligencia IA) {
		super(ubicacion);
		this.vida=vida;
		this.daño=daño;
		this.velocidadAtaque=velocidadAtaque;
		this.descripcion=descripcion;
		this.IA=IA;
		
	}
	//Getters
	public int getVida() {
		return vida;
	}
	public int getDaño() {
		return daño;
	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	public Inteligencia getInteligencia() {
		return IA;
	}
}
