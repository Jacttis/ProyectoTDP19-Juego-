package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Atacando extends Estado {

    public Atacando(Personaje personaje){
        super(personaje);
    }


    public void actuar() {
        personaje.cambiarGrafico(1);
    }


}
