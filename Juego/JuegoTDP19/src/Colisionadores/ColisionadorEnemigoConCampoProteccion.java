package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.CampoProteccion;
import Entidad.PowerUp.MagiaTemporal;

public class ColisionadorEnemigoConCampoProteccion extends ColisionadorEnemigo {

    private CampoProteccion campoProteccion;

    public ColisionadorEnemigoConCampoProteccion(Enemigo enemigo, CampoProteccion campoProteccion) {
        super(enemigo);
        this.campoProteccion=campoProteccion;
    }


    public void afectarAliado(Aliado chocada) {
        campoProteccion.aplicarEfecto(chocada);
    }
}
