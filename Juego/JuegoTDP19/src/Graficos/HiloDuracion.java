package Graficos;

import Entidad.Entidad;

public class HiloDuracion extends Thread {

    protected Grafico grafico;
    protected Entidad portador;

    public HiloDuracion(Grafico grafico, Entidad portador){
        this.grafico=grafico;
        this.portador=portador;
    }

    public void run(){

        try {
            sleep(800);

            grafico.cambiarGrafico(-1);



        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
