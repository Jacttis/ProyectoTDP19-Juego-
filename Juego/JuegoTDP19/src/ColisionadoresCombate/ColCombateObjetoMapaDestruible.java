package ColisionadoresCombate;

import Entidad.Aliados.Aliado;
import Entidad.Disparos.Disparo;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapaVida;
import Entidad.Personaje;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPreciosoVida;

import java.util.LinkedList;

public class ColCombateObjetoMapaDestruible implements ColisionadorCombate {

    protected ObjetoMapaVida objeto;
    protected LinkedList<Enemigo> detectados;

    public ColCombateObjetoMapaDestruible(ObjetoMapaVida objeto){
        this.objeto=objeto;
        detectados = new LinkedList<Enemigo>();
    }

    public void verificarColisionando() {
        if(objeto.fueDestruido()) {
            for (Personaje p : detectados)
                p.getEstado().cambiarACaminando();
        }
    }


    public void detectoAliado(Aliado chocada) {

    }


    public void detectoEnemigo(Enemigo chocada) {
        objeto.afectar(chocada);
        detectados.add(chocada);
    }


    public void detectoDisparo(Disparo chocada) {

    }


    public void detectoObjetoMapaDestruible(ObjetoMapaVida chocada) {

    }


    public void detectoObjetoPreciosoDestruible(ObjetoPreciosoVida chocada) {

    }

}
