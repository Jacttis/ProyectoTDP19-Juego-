package Colisionadores.ColisionadoresEnemigos;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.MagiasTemporales.CampoProteccion;

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
