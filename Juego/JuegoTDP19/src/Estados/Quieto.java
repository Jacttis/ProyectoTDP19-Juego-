package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Quieto extends Estado{
    public Quieto(Personaje personaje) {
        super(personaje);
    }


    public void actuar(){

        verificarEstado();
    }


    public void cambiarAQuieto(){

    }
}
