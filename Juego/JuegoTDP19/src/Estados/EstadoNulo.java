package Estados;

import Entidad.*;

public class EstadoNulo extends Estado {

    public EstadoNulo(Personaje personaje){
        super(personaje);
    }

    public void actuar() {
        personaje.getInteligencia().actualizarEntidad();
        personaje.cambiarGrafico(0);
    }

    public void verificarEstado(){
        if(personaje.getSerEliminado())
            personaje.eliminarse();
    }


}
