package Estados;

import Entidad.*;

public class Muerto extends Estado {

    protected boolean actuo;

    public Muerto (Entidad entidad){
        super(entidad);
        actuo=false;
    }

    public void actuar() {

        entidad.cambiarGrafico(2);
        hiloMuerte.start();
        entidad.setEstado(new EstadoNulo(entidad));
        entidad.eliminarse();



    }

    public void verificarEstado(){


    }
}
