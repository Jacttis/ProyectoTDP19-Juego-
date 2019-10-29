package Entidad.Aliados;

import Entidad.Disparos.Disparo;

public class HiloExplosion extends Thread {

    protected Disparo explosion;

    public HiloExplosion(Disparo explosion){
        this.explosion=explosion;
    }

    public void run(){

        try {

            sleep(600);
            explosion.eliminarse();

        }
        catch(InterruptedException e){}

    }
}
