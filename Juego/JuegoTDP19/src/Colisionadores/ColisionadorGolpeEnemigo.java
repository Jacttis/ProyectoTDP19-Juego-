package Colisionadores;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;
import Estados.Caminando;

public class ColisionadorGolpeEnemigo extends ColisionadorDisparo {


    public ColisionadorGolpeEnemigo(GolpeEnemigo golpeEnemigo){
        super(golpeEnemigo);
    }

    public void afectarAliado(Aliado chocada) {
        System.out.println("Golpeando aliado");
        disparo.afectarPersonaje(chocada);
        disparo.eliminarse();
    }


    public void afectarEnemigo(Enemigo chocada) {

    }


    public void afectarDisparo(Disparo chocada) {


    }


    public void afectarGolpeEnemigo(GolpeEnemigo chocada) {
        disparo.getDisparador().getEstado().cambiarACaminando();
        disparo.eliminarse();
        chocada.eliminarse();

    }
}
