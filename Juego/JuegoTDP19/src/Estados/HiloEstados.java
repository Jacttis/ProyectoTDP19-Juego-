package Estados;

import Entidad.Personaje;
import Juego.Mapa;

public class HiloEstados extends Thread {

    private Personaje personaje;

    public HiloEstados(Personaje personaje){

        this.personaje=personaje;

    }

    public void run() {
        try {


            System.out.println("Espera 1 segundo para eliminar grafico");
            Thread.sleep(700);

            personaje.eliminarse();


        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
