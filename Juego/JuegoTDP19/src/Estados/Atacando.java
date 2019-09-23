package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Atacando extends Estado {

    public Atacando(Entidad entidad){
        super(entidad);
    }


    public void actuar() {
        entidad.cambiarGrafico(1);
    }


}
