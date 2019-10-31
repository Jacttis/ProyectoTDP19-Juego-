package Colisionadores;

import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.CampoProteccion;

public class ColisionadorAliadoConCampoProteccion extends ColisionadorAliado {

    private CampoProteccion campoProteccion;

    public ColisionadorAliadoConCampoProteccion(Aliado aliado, CampoProteccion campoProteccion) {
        super(aliado);
        this.campoProteccion=campoProteccion;
    }

    public void afectarEnemigo(Enemigo chocada) {
        campoProteccion.aplicarEfecto(chocada);
        campoProteccion.getTiempoAfecto().interrupt();
        campoProteccion.desafectarPersonaje(aliado);
    }
}
