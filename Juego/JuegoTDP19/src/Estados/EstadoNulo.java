package Estados;

import Entidad.*;

public class EstadoNulo extends Estado {

    public EstadoNulo(Personaje personaje){
        super(personaje);
    }

    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * estado no produzcan ninguna funcion.
     *
     */

    public void actuar() {
    }

    public void verificarEstado() {
    }

    public void cambiarAAtacando() {

    }

    public void cambiarAQuieto() {

    }

    public void cambiarACaminando() {
    }
}
