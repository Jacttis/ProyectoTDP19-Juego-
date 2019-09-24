package Estados;

import Entidad.*;

public class Muerto extends Estado {

    public Muerto (Personaje personaje){
        super(personaje);
    }

    public void actuar() {

        personaje.cambiarGrafico(2);
        hiloMuerte.start();
    }
}
