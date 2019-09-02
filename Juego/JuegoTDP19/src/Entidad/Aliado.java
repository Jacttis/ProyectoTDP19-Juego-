/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package  Entidad;

import Inteligencia.Inteligencia;

import java.awt.*;

public class Aliado extends Personaje {

    String descripcion;

    public Aliado(,Point pos, int vida, int damage, int width, int height, float velocidadAtaque, Inteligencia IA,String Descripcion) {
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
