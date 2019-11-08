package Entidad.ObjetosMapa;

public class HiloDuracionObjetoMapa extends Thread {

    protected ObjetoMapaTiempo objeto;

    public HiloDuracionObjetoMapa(ObjetoMapaTiempo objeto){
        this.objeto=objeto;
    }

    /**
     * El hilo "espera" el tiempo que dure el objetoMapaTiempo
     * y al cabo de ese tiempo le envia el mensaje eliminarse al atributo objeto.
     *
     */

    public void run(){

        try {
            sleep(objeto.getDuracion());
            objeto.eliminarse();
        }
        catch( InterruptedException e ){e.printStackTrace();}

    }
}
