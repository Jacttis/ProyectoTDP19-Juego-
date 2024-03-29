package Tienda;

import Constantes.Constantes;
import Entidad.Aliados.Aliado;
import Juego.Mapa;

import java.awt.*;

/**
 *  Posiciona los aliados haciendo uso de la grilla
 *
 */

public class PosicionadorDeAliado {

    protected Grilla grillaDeAliados;

    public PosicionadorDeAliado(){
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

        int columna;
        if(pos.x<800){
            columna=(pos.x- Constantes.COLUMNA_1)/(Constantes.COLUMNA_2+22);
        }
        else {
            columna = (pos.x - Constantes.COLUMNA_1) / (Constantes.COLUMNA_2 + 10);
        }
        int fila=((pos.y-Constantes.FILA_1)/Constantes.FILA_2)-1;


        ParCelda celda = grillaDeAliados.obtenerCelda(columna,fila);


        if(!celda.ocupada){
            aliadoAAgregar.posicionar(celda);
            Mapa.getMapa().agregarEntidad(aliadoAAgregar);
            Tienda.getTienda().disminuirOro(aliadoAAgregar.getPrecio());
            Tienda.getTienda().borrarNextToAdd();
        }

    }

    public void desposicionarAliado(Aliado aliadoAEliminar){

        aliadoAEliminar.getCelda().desocupar();

    }

}
