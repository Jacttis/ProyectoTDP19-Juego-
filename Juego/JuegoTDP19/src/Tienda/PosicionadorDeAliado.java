package Tienda;

import Constantes.Constantes;
import Entidad.Aliado;
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

        System.out.println(pos.x+" x");
        System.out.println(pos.y+" y");

        int columna=(pos.x- Constantes.COLUMNA_1)/(Constantes.COLUMNA_2+Constantes.TREINTA);
        int fila=((pos.y-Constantes.FILA_1)/Constantes.FILA_2)-1;



        System.out.println(fila+" fila");
        System.out.println(columna+" columna");

        ParCelda celda = grillaDeAliados.obtenerCelda(columna,fila);

        System.out.println(celda.getPos().x+" "+celda.getPos().y+" x y pos celda");


        if(!celda.ocupada){
            celda.ocupar();
            aliadoAAgregar.posicionar(celda);
            Mapa.getMapa().agregarEntidad(aliadoAAgregar);

        }

    }

    public void desposicionarAliado(Aliado aliadoAEliminar){

        aliadoAEliminar.getCelda().desocupar();

    }

}
