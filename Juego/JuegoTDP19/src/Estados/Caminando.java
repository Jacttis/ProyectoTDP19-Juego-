package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Caminando extends Estado {


    public Caminando(Personaje personaje){

        super(personaje);

    }


    public void actuar(){

        personaje.getInteligencia().actualizarEntidad();
        personaje.cambiarGrafico(0);

        verificarEstado();

    }

    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * estado no produzcan ninguna funcion.
     *
     */
    public void cambiarACaminando(){

    }
}
