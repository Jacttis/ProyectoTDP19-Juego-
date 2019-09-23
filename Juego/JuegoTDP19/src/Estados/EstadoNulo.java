package Estados;

import Entidad.Entidad;

public class EstadoNulo extends Estado {
        private  Estado lean;

    public EstadoNulo(Entidad entidad){
        super(entidad);
    }

    public void actuar() {

    }

}
