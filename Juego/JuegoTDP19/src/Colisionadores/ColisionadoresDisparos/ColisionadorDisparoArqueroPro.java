package Colisionadores.ColisionadoresDisparos;

import Colisionadores.ColisionadoresDisparos.ColisionadorDisparo;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;

public class ColisionadorDisparoArqueroPro extends ColisionadorDisparo {

    protected Enemigo primerChocado;

    public ColisionadorDisparoArqueroPro(Disparo disparo) {
        super(disparo);
        primerChocado=null;
    }

    /**
     * Redefinicion del afectarEnemigo de ColisionadorDisparo
     * En este caso afecta al enemigo de forma que al primero que choca le hace el daño y lo alamacena
     * en el atributo primerChocado, de forma que si colisiona con otro enemigo y es distinto a primerChocado
     * lo afecta y ahi si el disparo se destruye. (El disparo del arquero pro afecta hasta dos enemigos).
     *
     * @param chocada
     */
    public void afectarEnemigo(Enemigo chocada) {

        //si no choco a nadie
        if(primerChocado==null){
            disparo.afectarPersonaje(chocada); //afecta al personaje
            disparo.getComponentesGraficas().cambiarGrafico(1);
            primerChocado=chocada;
        }

        else //si ya choco a alguien
            if(!primerChocado.equals(chocada)){
                //en este if se verifica si el enemigo chocado actual es distinto a primerChocado (ya que si es el mismo no lo debe afectar dos veces)
                disparo.afectarPersonaje(chocada);
                disparo.eliminarse();

            }
    }
}
