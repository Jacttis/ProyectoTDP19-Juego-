package Entidad.ObjetosMapa;

public class HiloDuracionObjetoMapa extends Thread {

    protected ObjetoMapaTiempo objeto;

    public HiloDuracionObjetoMapa(ObjetoMapaTiempo objeto){
        this.objeto=objeto;
    }

    public void run(){

        try {
            sleep(objeto.getDuracion());
            objeto.eliminarse();
        }
        catch( InterruptedException e ){e.printStackTrace();}

    }
}
