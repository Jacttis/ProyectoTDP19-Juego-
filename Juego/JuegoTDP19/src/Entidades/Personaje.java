package Entidades;
import java.awt.*;

import Inteligencia.Inteligencia;

public abstract class Personaje extends Entidad {
	
<<<<<<< HEAD
	protected int vida,da�o;
=======
	protected int vida,damage;
>>>>>>> 43d99f18a4e22663e89e8a076bd2489fd535e245
	protected float velocidadAtaque;

	
	protected Premio objetos [];
	
<<<<<<< HEAD
	public Personaje(Point pos,int vida,int da�o,float velocidadAtaque,String descripcion,Inteligencia IA) {
		super(pos,IA);
		this.vida=vida;
		this.da�o=da�o;
=======
	public Personaje(Point pos,int vida,int damage, int width, int height,float velocidadAtaque,Inteligencia IA) {
		super(pos,width,height,IA);
		this.vida=vida;
		this.damage=damage;
>>>>>>> 43d99f18a4e22663e89e8a076bd2489fd535e245
		this.velocidadAtaque=velocidadAtaque;
		this.IA=IA;
	}
	//Getters
	public int getVida() {
		return vida;
	}
<<<<<<< HEAD
	public int getDa�o() {
		return da�o;
=======
	public int getDamage() {
		return damage;
>>>>>>> 43d99f18a4e22663e89e8a076bd2489fd535e245
	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	
}
