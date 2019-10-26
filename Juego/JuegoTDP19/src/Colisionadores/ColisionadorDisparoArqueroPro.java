package Colisionadores;

import Entidad.Disparo;
import Entidad.Enemigo;
import Graficos.Grafico;

public class ColisionadorDisparoArqueroPro extends ColisionadorDisparo {

    protected Enemigo primerChocado;

    public ColisionadorDisparoArqueroPro(Disparo disparo) {
        super(disparo);
    }

    /**
     * Afecta al Enemigo parametrizado, de la forma que corresponda.
     * Despues de afectarlo, disparo es eliminado.
     *
     *
     * @param chocada
     */
    public void afectarEnemigo(Enemigo chocada) {

        if(primerChocado==null){
            disparo.afectarPersonaje(chocada);
            if(chocada.estaMuerto()){
                disparo.getDisparador().getEstado().cambiarAQuieto();
            }
            disparo.getComponentesGraficas().cambiarGrafico(1);
            primerChocado=chocada;
        }

        else
            if(!primerChocado.equals(chocada)){
                disparo.afectarPersonaje(chocada);
                disparo.eliminarse();

            }
    }
}
