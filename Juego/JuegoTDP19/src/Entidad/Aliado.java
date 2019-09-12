/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package  Entidad;

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
     
    

    /**
     * Crea un Personaje Aliado
     * @param pos
     * @param vida
     * @param damage
     * @param width
     * @param height
     * @param velocidadAtaque
     * @param IA
     * @param Descripcion
     */
    public Aliado(Point pos, int vida, int damage,float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos) {
        super(pos, vida, damage, velocidadAtaque,0);
        IA=new InteligenciaAliados(this);
        imagen =new ImageIcon[2];
        descripcion=Descripcion;
        this.fabricaDisparos=fabricaDisparos;
        puedeDisparar=true;

    }
    /**
     * Devuelve la descripcion del Personaje Aliado
     * @return String con personaje aliado
     */
    public String getDescripcion(){
        return descripcion;
    }
    
    public abstract Disparo disparar();
    
    
    /**
     * actualiza la posicion de la entidad y
     * si ocurre dependiendo del random, provoca que la entidad dispare
     */
    
    public void actualizarEntidad() {
    	IA.actualizarEntidad();
    	
    	/*
    	Random r=new Random();
		int n = r.nextInt(100);
		
		if(n==4) {
			
			//System.out.println("Se agrego disparo");
			fabricaDisparos.generarDisparo(this);
		}
		*/
    	
    	
    	fabricaDisparos.generarDisparo(this);
   
    	
    }

    
    
    public void setPuedeDisparar(boolean puede) {
    	puedeDisparar=puede;
    }
    
    public boolean puedeDisparar() {
    	return puedeDisparar;
    }

}
