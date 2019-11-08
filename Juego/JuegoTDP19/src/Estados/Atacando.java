package Estados;

import Entidad.Personaje;

public class Atacando extends Estado {

    public Atacando(Personaje personaje){
        super(personaje);
    }


    public void actuar() {

        personaje.getComponentesGraficas().cambiarGrafico(1);

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
