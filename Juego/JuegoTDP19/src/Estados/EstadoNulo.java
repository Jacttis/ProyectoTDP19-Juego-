package Estados;

import Entidad.*;

public class EstadoNulo extends Estado {

    public EstadoNulo(Entidad entidad){
        super(entidad);
    }

    public void actuar() {
        entidad.getInteligencia().actualizarEntidad();
        entidad.cambiarGrafico(0);
    }

    public void verificarEstado(){
        if(entidad.getSerEliminado())
            entidad.eliminarse();
    }


}
