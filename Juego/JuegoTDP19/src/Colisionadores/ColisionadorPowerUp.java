package Colisionadores;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;
import Entidad.PowerUp.PowerUp;

public class ColisionadorPowerUp implements Colisionador {

    protected PowerUp power;

    public ColisionadorPowerUp(PowerUp power){
        this.power=power;
    }

    public void afectarAliado(Aliado chocada) {

    }


    public void afectarEnemigo(Enemigo chocada) {

    }


    public void afectarDisparo(Disparo chocada) {

    }


    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }

    public void afectarPowerUp(PowerUp chocada){

    }
}
