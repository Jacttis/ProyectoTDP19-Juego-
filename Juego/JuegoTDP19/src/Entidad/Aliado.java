/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package  Entidad;

import Inteligencia.Inteligencia;

import java.awt.*;

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
    public Aliado(Point pos, int vida, int damage,float velocidadAtaque, Inteligencia IA,String Descripcion) {
        super(pos, vida, damage, width, height, velocidadAtaque, IA);
        image =new ImagenIcon[2];
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
