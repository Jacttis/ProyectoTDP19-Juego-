package Entidad.PowerUp.ObjetosPreciosos;

import Entidad.Personaje;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;

public class HiloObjetoPrecioso extends Thread {

    protected ObjetoPreciosoTiempo objetoPreciosoTiempo;

    public HiloObjetoPrecioso (ObjetoPreciosoTiempo objetoPrecioso){
        this.objetoPreciosoTiempo=objetoPrecioso;
    }

    public void run(){

        try {
            sleep(objetoPreciosoTiempo.getDuracion());

            for(Personaje p : objetoPreciosoTiempo.getAlcanzados())
                objetoPreciosoTiempo.afectar(p);

            objetoPreciosoTiempo.eliminarse();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
