package Estados;

import Entidad.Entidad;
import Entidad.Personaje;

public class Caminando extends Estado {


    public Caminando(Entidad entidad){

        super(entidad);

    }


    public void actuar(){

        entidad.getInteligencia().actualizarEntidad();
        entidad.cambiarGrafico(0);

        verificarEstado();

    }

    public void verificarEstado(){

        if(entidad.getSerEliminado())
            entidad.setEstado(new Muerto(entidad));

    }
}
