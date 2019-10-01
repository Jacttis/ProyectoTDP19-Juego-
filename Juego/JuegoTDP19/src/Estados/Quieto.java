package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Quieto extends Estado{
    public Quieto(Entidad entidad) {
        super(entidad);
    }


    public void actuar(){

        verificarEstado();
    }

    public void verificarEstado(){

        if(entidad.getSerEliminado())
            entidad.setEstado(new Muerto(entidad));

    }
}
