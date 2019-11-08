package Colisionadores.ColisionadoresAliados;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.MagiasTemporales.CampoProteccion;

public class ColisionadorAliadoConCampoProteccion extends ColisionadorAliado {

    private CampoProteccion campoProteccion;

    public ColisionadorAliadoConCampoProteccion(Aliado aliado, CampoProteccion campoProteccion) {
        super(aliado);
        this.campoProteccion=campoProteccion;
    }

    /**
     * Redefinicion del afectarEnemigo de colisionador aliado.
     * En este caso, al tener el campo de proteccion, al chocar con un enemigo el campo lo matara instantaneamente.
     *
     * @param chocada
     */

    public void afectarEnemigo(Enemigo chocada) {
        campoProteccion.aplicarEfecto(chocada);
        campoProteccion.getTiempoAfecto().interrupt();
        campoProteccion.desafectarPersonaje(aliado);
    }
}
