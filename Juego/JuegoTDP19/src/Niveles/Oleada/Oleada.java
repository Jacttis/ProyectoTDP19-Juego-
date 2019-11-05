package Niveles.Oleada;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.FabricaEnemigo;
import Juego.Mapa;
import Niveles.Nivel;
import Constantes.Constantes;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public abstract class Oleada extends Thread{


    protected Nivel nivel;
    protected int cantEnemigosDeOleada;
    protected Oleada oleadaSiguiente;
    protected LinkedList<Enemigo> enemigosGenerados;
    protected JLabel cartelOleada1,cartelOleada2;

    public Oleada(Nivel nivel){
        this.cantEnemigosDeOleada=cantEnemigosDeOleada;
        enemigosGenerados = new LinkedList<Enemigo>();
        this.nivel=nivel;
        cantEnemigosDeOleada=0;

        cartelOleada1 = new JLabel();
        cartelOleada2 = new JLabel();
    }

    public abstract void run();

    public boolean verificarMuerteDeOleada(){
        boolean murieronTodos=true;

        for(Enemigo enemigo : enemigosGenerados)
            if (!enemigo.estaMuerto()){
                murieronTodos=false;
                break;
            }
        return murieronTodos;
    }

    public boolean verificarEnemigoGano(){
        boolean enemigoGano=false;

        for(Enemigo enemigo : enemigosGenerados)
            if(enemigo.getPos().x<-100){
                enemigoGano=true;
                break;
            }
        return enemigoGano;
    }

    protected int obtenerPosicionAleatoriaEnY(){
        Random r=new Random();
        int n=(r.nextInt(6));
        return Constantes.ENEMIGO_Y1 +(Constantes.ENEMIGO_Y2*n);
    }

    public Oleada getSiguiente(){
        return oleadaSiguiente;
    }

    public void agregarEnemigo(Enemigo enemigo){
        enemigosGenerados.add(enemigo);
        Mapa.getMapa().agregarEntidad(enemigo);
    }

    public void setEnemigosAGenerar(int cantEnemigosDeOleada){
        this.cantEnemigosDeOleada=cantEnemigosDeOleada;
    }

    public LinkedList<Enemigo> getEnemigosGenerados(){
        return enemigosGenerados;
    }

    public void inicializarCartelOleada(){
        cartelOleada1.setForeground(Color.RED);
        cartelOleada1.setFont(new Font("Times New Roman", 3,100));
        cartelOleada1.setBounds(550,200,3000,400);


        cartelOleada2.setForeground(Color.BLACK);
        cartelOleada2.setFont(new Font("Times New Roman", 3,100));
        cartelOleada2.setBounds(555,205,3000,400);

        Mapa.getMapa().getGui().add(cartelOleada2);
        Mapa.getMapa().getGui().add(cartelOleada1);
    }

    public void retirarCartelOleada(){
        Mapa.getMapa().getGui().remove(cartelOleada1);
        Mapa.getMapa().getGui().remove(cartelOleada2);
    }
}
