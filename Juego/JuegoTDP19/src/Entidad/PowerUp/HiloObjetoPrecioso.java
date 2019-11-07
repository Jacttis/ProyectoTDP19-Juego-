package Entidad.PowerUp;

import Entidad.Personaje;

public class HiloObjetoPrecioso extends Thread {

    protected ObjetoPrecioso objetoPrecioso;

    public HiloObjetoPrecioso (ObjetoPrecioso objetoPrecioso){
        this.objetoPrecioso=objetoPrecioso;
    }

    public void run(){

        try {
            sleep(objetoPrecioso.getDuracion());

            for(Personaje p : objetoPrecioso.getAlcanzados())
                objetoPrecioso.afectar(p);

            objetoPrecioso.eliminarse();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
