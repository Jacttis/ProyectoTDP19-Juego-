package Niveles;

public class HiloNivel extends Thread {

    protected Nivel nivel;

    public HiloNivel(Nivel nivel){
        this.nivel=nivel;
    }

    public void run (){

        try {

             this.sleep(3000);
             nivel.generarEnemigos();
             this.sleep(5000);
             nivel.generarEnemigos();




        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
