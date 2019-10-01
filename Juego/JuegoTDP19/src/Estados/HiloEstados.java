package Estados;

import Entidad.*;
import Juego.Mapa;

public class HiloEstados extends Thread {

    private Entidad entidad;

    public HiloEstados(Entidad entidad){

        this.entidad=entidad;

    }

    public void run() {
        try {


            System.out.println("Espera 1 segundo para eliminar grafico");
            Thread.sleep(700);




        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
