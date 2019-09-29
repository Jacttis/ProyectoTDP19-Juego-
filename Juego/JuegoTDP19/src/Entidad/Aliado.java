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
     protected Entidad disparo;
    

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
        imagen =new ImageIcon[3];
        descripcion=Descripcion;
        this.fabricaDisparos=fabricaDisparos;
        puedeDisparar=true;

        precio=1;

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
        disparar();
    }

    public abstract void disparar();
    
    
    /**
     * actualiza la entidad mediante su estado.
     *
     */
    
    public void actualizarEntidad() {
    	estado.actuar();

    }

    
    
    public void setPuedeDisparar(boolean puede) {
    	puedeDisparar=puede;
    }
    
    public boolean puedeDisparar() {
    	return puedeDisparar;
    }

    public int getPrecio(){
        return precio;
    }






    public FabricaDisparo getFabricaDisparos(){
        return fabricaDisparos;
    }

}
