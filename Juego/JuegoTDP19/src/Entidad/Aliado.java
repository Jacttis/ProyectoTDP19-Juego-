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
    public Aliado(int vida, int damage,float velocidadAtaque, String Descripcion) {
        super(new Point(0,0), vida, damage, velocidadAtaque,0);
        IA=new InteligenciaAliados(this);
        imagen =new ImageIcon[3];
        descripcion=Descripcion;
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

    /**
     * Retorna el valor del atributo precio del Aliado
     *
     *
     * @return int precio
     */

    public int getPrecio(){
        return precio;
    }


    /**
     * Redefinicion del eliminarse mas general.
     *
     * Cuando se elimina desocupa la posicion en celda que ocupaba.
     *
     */

    public void eliminarse(){

        celdaUbicado.desocupar();
        Mapa.getMapa().eliminarPersonaje(this);
    }

    public void posicionar(ParCelda celda){
        celdaUbicado=celda;
        pos.setLocation(celda.getPos());
    }

    public ParCelda getCelda(){
        return celdaUbicado;
    }

    /**
     * implementacion del metodo abstracto serChocado.
     *
     * Le envia al colisionador parametrizado el mensaje afectarAliado, con
     * esta instancia (Aliado) como parametro.
     * @param colisionador
     */

    public void serChocado(Colisionador colisionador){
        colisionador.afectarAliado(this);
    }
}
