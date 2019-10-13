package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Atacando extends Estado {

    public Atacando(Personaje personaje){
        super(personaje);
    }


    public void actuar() {

        personaje.cambiarGrafico(1);

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
