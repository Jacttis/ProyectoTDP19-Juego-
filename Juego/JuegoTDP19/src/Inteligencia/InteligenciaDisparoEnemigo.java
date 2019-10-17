package Inteligencia;

import Entidad.Entidad;

public class InteligenciaDisparoEnemigo extends Inteligencia {

    public InteligenciaDisparoEnemigo(Entidad e) {
        super(e);

    }

    public void actualizarEntidad() {

        entidad.getPos().setLocation(entidad.getPos().x-entidad.getVelocidad(),entidad.getPos().y);
        entidad.cambiarGrafico(0);

        if(entidad.getPos().x<-200)
            entidad.eliminarse();
    }
}
