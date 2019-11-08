package Graficos;

import Graficos.TiposGrafico.Grafico;
import Juego.Mapa;

import java.util.LinkedList;

public class Graficos {

    private LinkedList<Grafico> listaGraficos;

    public Graficos(){
        listaGraficos=new LinkedList<Grafico>();
    }

    public void actualizarGraficos(){
        for(Grafico g : listaGraficos)
            g.actualizarGrafico();



    }

    public void cambiarGrafico(int dir){
        for(Grafico g : listaGraficos)
            g.cambiarGrafico(dir);
    }

    /**
     * Agregar un grafico a la lista de graficos.
     *
     * @param grafico
     */

    public void agregarGrafico(Grafico grafico){
        listaGraficos.add(grafico);
    }

    /**
     * Agregar un nuevo grafico a la lista de graficos de la entidad
     * la cual ya esta siendo mostrada, por lo tanto el nuevo grafico
     * debe ser incluido en la gui
     *
     * @param nuevoGrafico
     */

    public void agregarNuevoGrafico(Grafico nuevoGrafico){

        listaGraficos.add(nuevoGrafico);
        LinkedList<Grafico> graficosAAgregar = new LinkedList<Grafico>();


        Mapa.getMapa().agregarGrafico(nuevoGrafico);
    }


    public void eliminarGrafico(Grafico graficoAEliminar){
        for(Grafico g : listaGraficos)
            if(g.equals(graficoAEliminar)) {
                listaGraficos.remove(graficoAEliminar);
                Mapa.getMapa().removerGrafico(graficoAEliminar);
                break;
            }
    }

    public LinkedList<Grafico> getListaGraficos(){
        return listaGraficos;
    }
}
