package Tienda;

import Entidad.Aliado;
import Juego.Mapa;

import java.awt.*;

/**
 *  Posiciona los aliados haciendo uso de la grilla
 *
 */

public class PosicionadorDeAliado {

    protected Grilla grillaDeAliados;
    protected Mapa mapa;

    public PosicionadorDeAliado(Mapa mapa){
        this.mapa=mapa;
        grillaDeAliados=new Grilla();

    }

    /**
     *  Segun la posicion dada, obtiene la celda donde debe ser ubicado el aliado
     *  y se la pide a la grilla
     *  Si la celda no esta ocupada la ocupa y le asigna al aliado la posicion de esa celda
     *  y luego lo inserta en el mapa.
     *
     * @param pos
     * @param aliadoAAgregar
     */

    public void posicionarAliado(Point pos, Aliado aliadoAAgregar){

        int fila=(pos.x-65)/170;
        int columna=(pos.y-255)/105;

        ParCelda celda = grillaDeAliados.obtenerCelda(fila,columna);

        if(!celda.ocupada){
            celda.ocupar();
            aliadoAAgregar.posicionar(celda.getPos());
            mapa.agregarEntidad(aliadoAAgregar);

        }

    }

}
