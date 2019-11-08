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

    /**
     * Redefinicion del afectarAliado de ColisionadorEnemigo
     *
     * Afecta al Aliado parametrizado, de la forma que corresponda.
     * En este caso como el enemigo posee el campo de proteccion, al colisionar con un aliado
     * el campo de proteccion lo afecta, de forma que el aliado muere al instante.
     *
     * @param chocada
     */

    public void afectarAliado(Aliado chocada) {
        campoProteccion.aplicarEfecto(chocada);
    }
}
