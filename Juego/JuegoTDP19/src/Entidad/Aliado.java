/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package  Entidad;

import Inteligencia.Inteligencia;
import Inteligencia.InteligenciaAliados;
import Inteligencia.InteligenciaEnemigos;

import java.awt.*;

import javax.swing.ImageIcon;

public class Aliado extends Personaje {

     protected String descripcion;

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
    public Aliado(Point pos, int vida, int damage,float velocidadAtaque, String Descripcion) {
        super(pos, vida, damage, velocidadAtaque,0);
        IA=new InteligenciaAliados(this);
        imagen =new ImageIcon[2];
        descripcion=Descripcion;

    }
    /**
     * Devuelve la descripcion del Personaje Aliado
     * @return String con personaje aliado
     */
    public String getDescripcion(){
        return descripcion;
    }


}
