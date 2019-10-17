package ColisionadoresCombate;

import Colisionadores.ColisionadorGolpeEnemigo;
import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;

public class ColCombateEnemigo implements ColisionadorCombate {

    protected Enemigo enemigo;

    public ColCombateEnemigo(Enemigo enemigo){
        this.enemigo=enemigo;
    }

    public void detectoAliado(Aliado chocada) {
        enemigo.getEstado().cambiarAAtacando();
    }


    public void detectoEnemigo(Enemigo chocada) {

    }

    public void detectoDisparo(Disparo chocada) {

    }

    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }
}
