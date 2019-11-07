package Entidad.PowerUp.MagiasTemporales;

import Entidad.Aliados.Aliado;

public class HiloPowers extends Thread {

    protected MagiaTemporal magia;
    protected Aliado personajeAfectado;

    public HiloPowers(MagiaTemporal magia,Aliado personaje){
        this.magia=magia;
        this.personajeAfectado=personaje;
    }

    public void run(){

        try {
            sleep(magia.getDuracion());
            magia.desafectarPersonaje(personajeAfectado);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
