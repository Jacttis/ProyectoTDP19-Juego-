package FabricaObjetoMapaEvento;

import Entidad.ObjetosMapa.ObjetoMapa;

import java.awt.*;
import java.util.Random;
import java.util.stream.IntStream;

public abstract class FabricaMapaEvento {

    public abstract ObjetoMapa getEvento();

    /**
     * Obtiene una posicion aleatoria para posicionar el evento
     *
     * @return Point posicion
     */

    protected Point getPosicionAleatoria(){
        Random r = new Random();
        IntStream intStreamX = r.ints(1 , 800 , 1600);
        int posX = intStreamX.sum();

        IntStream intStreamY = r.ints(1 , 400 , 800);
        int posY = intStreamY.sum();

        return new Point(posX,posY);
    }
}
