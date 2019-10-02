package Colisionadores;

import Entidad.*;
import Estados.Atacando;

public class ColisionadorAliado implements Colisionador {

    protected Aliado aliado;

    public ColisionadorAliado(Aliado aliado){
        this.aliado=aliado;
    }




    public void afectarAliado(Aliado chocada) {

    }

    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }


    public void afectarDisparo(Disparo chocada) {

    }

    public void afectarEnemigo(Enemigo chocada) {

        chocada.getEstado().cambiarAAtacando();

    }
}
