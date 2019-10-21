package Entidad.PowerUp;

import Entidad.Personaje;

public class HiloPowers extends Thread {

    protected MagiaTemporal magia;
    protected Personaje personajeAfectado;

    public HiloPowers(MagiaTemporal magia,Personaje personaje){
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
