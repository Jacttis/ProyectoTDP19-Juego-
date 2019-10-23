package Estados;

import Entidad.Entidad;
import Entidad.Personaje;
import Graficos.Grafico;

public class Atacando extends Estado {

    public Atacando(Personaje personaje){
        super(personaje);
    }


    public void actuar() {

        for( Grafico grafico : personaje.getListaGraficos()) {
            grafico.cambiarGrafico(1);
        }

        personaje.actualizarGraficos();

        personaje.atacar();

        verificarEstado();


    }

    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * estado no produzcan ninguna funcion.
     *
     */
    public void cambiarAAtacando(){

    }



}
