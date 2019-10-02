package Colisionadores;

import Entidad.*;
import Estados.Atacando;

public class ColisionadorEnemigo implements Colisionador {

    protected Enemigo enemigo;

    public ColisionadorEnemigo(Enemigo enemigo){
        this.enemigo=enemigo;
    }




    public void afectarAliado(Aliado chocada) {

    }

    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }


    public void afectarDisparo(Disparo chocada) {

    }

    public void afectarEnemigo(Enemigo chocada) {

    }
}
