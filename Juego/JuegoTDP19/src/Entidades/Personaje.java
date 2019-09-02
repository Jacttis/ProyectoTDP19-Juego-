package Entidades;
import java.awt.*;

import Inteligencia.Inteligencia;

public abstract class Personaje extends Entidad {
	
	protected int vida,damage;
	protected float velocidadAtaque;

	
	protected Premio objetos [];
	

	public Personaje(Point pos,int vida,int damage, int width, int height,float velocidadAtaque,Inteligencia IA) {
		super(pos,width,height,IA);
		this.vida=vida;
		this.damage=damage;
		this.velocidadAtaque=velocidadAtaque;
		this.IA=IA;
	}
	//Getters
	public int getVida() {
		return vida;
	}

	public int getDamage() {
		return damage;

	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	
}
