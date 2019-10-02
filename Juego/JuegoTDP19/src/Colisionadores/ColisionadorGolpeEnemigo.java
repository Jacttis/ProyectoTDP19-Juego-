package Colisionadores;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;

public class ColisionadorGolpeEnemigo extends ColisionadorDisparo {


    public ColisionadorGolpeEnemigo(GolpeEnemigo golpeEnemigo){
        super(golpeEnemigo);
    }

    @Override
    public void afectarAliado(Aliado chocada) {
        System.out.println("Golpeando aliado");
        disparo.afectarPersonaje(chocada);
        disparo.eliminarse();
    }

    @Override
    public void afectarEnemigo(Enemigo chocada) {

    }

    @Override
    public void afectarDisparo(Disparo chocada) {

    }

    @Override
    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {

    }
}
