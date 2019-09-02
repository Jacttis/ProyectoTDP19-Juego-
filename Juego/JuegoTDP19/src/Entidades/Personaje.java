package Entidades;
import java.awt.*;

public abstract class Personaje extends Entidad {
	
	protected int vida,da�o;
	protected float velocidadAtaque;
	protected String descripcion;
	
	protected Premio objetos [];
	
	public Personaje(Point pos,int vida,int da�o,float velocidadAtaque,String descripcion,Inteligencia IA) {
		super(pos,IA);
		this.vida=vida;
		this.da�o=da�o;
		this.velocidadAtaque=velocidadAtaque;
		this.descripcion=descripcion;
		
		
	}
	//Getters
	public int getVida() {
		return vida;
	}
	public int getDa�o() {
		return da�o;
	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	public Inteligencia getInteligencia() {
		return IA;
	}
}
