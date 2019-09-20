package Estados;

import Entidad.Entidad;

public class EstadoNulo extends Estado {


    public EstadoNulo(Entidad entidad){
        super(entidad);
    }

    public void actuar() {
        entidad.getInteligencia().actualizarEntidad();
    }
}
