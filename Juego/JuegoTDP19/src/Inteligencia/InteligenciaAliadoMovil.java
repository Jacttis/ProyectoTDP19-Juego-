package Inteligencia;

import Entidad.Aliados.Aliado;

public class InteligenciaAliadoMovil extends InteligenciaAliados {

    public InteligenciaAliadoMovil(Aliado e) {
        super(e);
    }

    public void actualizarEntidad() {
        entidad.getPos().setLocation(entidad.getPos().x+entidad.getVelocidad(),entidad.getPos().y);
        entidad.actualizarGraficos();

        if(entidad.getPos().x > 2200)
            entidad.eliminarse();
    }
}
