package Inteligencia;

import Entidad.*;
import Juego.Mapa;

public class InteligenciaGolpeEnemigo extends Inteligencia {

    public InteligenciaGolpeEnemigo(Entidad e){
        super(e);
    }

    public void actualizarEntidad() {

        entidad.actualizarGraficos();
    }
}
