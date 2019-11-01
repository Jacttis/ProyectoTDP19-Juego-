package Juego;

import Niveles.Nivel;

public class HiloDescansoCambioNivel extends Thread {

    protected Nivel nivelActual;

    public HiloDescansoCambioNivel(Nivel nivelActual){
        this.nivelActual=nivelActual;

    }

    public void run(){


        try {



            sleep(2500);
            Mapa.getMapa().cambiarNivel(nivelActual);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
