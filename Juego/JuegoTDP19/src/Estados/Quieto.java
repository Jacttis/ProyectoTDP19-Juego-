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


    public void cambiarAQuieto(){

    }
}
