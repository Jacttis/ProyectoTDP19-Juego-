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

    public void verificarEstado(){

        if(personaje.getSerEliminado())
            personaje.setEstado(new Muerto(personaje));

    }

    public void cambiarAQuieto(){

    }
}
