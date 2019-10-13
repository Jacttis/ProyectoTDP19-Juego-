package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Quieto extends Estado{
    public Quieto(Personaje personaje) {
        super(personaje);
    }


    public void actuar(){

        personaje.cambiarGrafico(0);
        personaje.actualizarEtiquetaVida(0);

        verificarEstado();
    }


    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * estado no produzcan ninguna funcion.
     *
     */

    public void cambiarAQuieto(){

    }
}
