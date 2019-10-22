package ColisionadoresCombate;

import Entidad.Aliado;
import Entidad.Disparo;
import Entidad.Enemigo;
import Entidad.GolpeEnemigo;

public class ColCombateAliado implements ColisionadorCombate {

    protected Aliado aliado;

    public ColCombateAliado(Aliado aliado){
        this.aliado=aliado;
    }

    public void verificarColisionando(){

    }

    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {
        aliado.getEstado().cambiarAAtacando();
    }


    public void detectoDisparo(Disparo chocada) {

    }


    public void detectoGolpeEnemigo(GolpeEnemigo chocada) {

    }
}
