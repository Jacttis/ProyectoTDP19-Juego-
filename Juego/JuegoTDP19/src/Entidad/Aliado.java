/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package  Entidad;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorAliado;
import Estados.Atacando;
import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaAliados;
import Inteligencia.InteligenciaEnemigos;

import java.awt.*;
import java.util.Random;

import javax.swing.ImageIcon;

import FabricaDisparos.FabricaDisparo;
import Juego.Mapa;
import Tienda.*;

public abstract class Aliado extends Personaje {

     protected String descripcion;
     protected FabricaDisparo fabricaDisparos;
     protected int precio;
     protected Entidad disparo;
     protected ParCelda celdaUbicado;
    

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
        colisionador=new ColisionadorAliado(this);


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



    public int getPrecio(){
        return precio;
    }


    public FabricaDisparo getFabricaDisparos(){
        return fabricaDisparos;
    }

    public void eliminarse(){

        celdaUbicado.desocupar();
        Mapa.getMapa().eliminarEntidad(this);
    }

    public void posicionar(ParCelda celda){
        celdaUbicado=celda;
        pos.setLocation(celda.getPos());
    }

    public ParCelda getCelda(){
        return celdaUbicado;
    }

    public void serChocado(Colisionador colisionador){
        colisionador.afectarAliado(this);
    }
}
