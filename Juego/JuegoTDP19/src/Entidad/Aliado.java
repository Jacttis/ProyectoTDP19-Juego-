/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package  Entidad;

import Estados.Atacando;
import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaAliados;
import Inteligencia.InteligenciaEnemigos;

import java.awt.*;
import java.util.Random;

import javax.swing.ImageIcon;

import FabricaDisparos.FabricaDisparo;

public abstract class Aliado extends Personaje {

     protected String descripcion;
     protected FabricaDisparo fabricaDisparos;
     protected boolean puedeDisparar;
     protected int precio;
    

    /**
     * Crea un Personaje Aliado

     * @param vida
     * @param damage

     * @param velocidadAtaque

     * @param Descripcion
     */
    public Aliado(int vida, int damage,float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
        super(new Point(0,0), vida, damage, velocidadAtaque,0);
        IA=new InteligenciaAliados(this);
        imagen =new ImageIcon[2];
        descripcion=Descripcion;
        this.fabricaDisparos=fabricaDisparos;
        puedeDisparar=true;

        estado=new Atacando(this);

    }
    /**
     * Devuelve la descripcion del Personaje Aliado
     * @return String con personaje aliado
     */
    public String getDescripcion(){
        return descripcion;
    }

    public void atacar(){
        fabricaDisparos.generarDisparo(this);
    }

    public abstract Disparo disparar();
    
    
    /**
     * actualiza la posicion de la entidad y
     * si ocurre dependiendo del random, provoca que la entidad dispare
     */
    
    public void actualizarEntidad() {
    	estado.actuar();
    	
    	/*
    	Random r=new Random();
		int n = r.nextInt(100);
		
		if(n==4) {
			
			//System.out.println("Se agrego disparo");
			fabricaDisparos.generarDisparo(this);
		}
		*/
    	
    	
    	//fabricaDisparos.generarDisparo(this);
   
    	
    }

    
    
    public void setPuedeDisparar(boolean puede) {
    	puedeDisparar=puede;
    }
    
    public boolean puedeDisparar() {
    	return puedeDisparar;
    }
    protected int getPrecio(){
        return precio;
    }

    public void posicionar(Point posicionNueva){
        this.pos=posicionNueva;
        this.cambiarGrafico(0);
    }

    public FabricaDisparo getFabricaDisparos(){
        return fabricaDisparos;
    }
}
