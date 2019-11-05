package Niveles.Oleada;

import Entidad.Enemigos.Enemigo;
import Juego.Mapa;
import Niveles.*;
import Constantes.Constantes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PrimerOleada extends Oleada {

    public PrimerOleada(Nivel nivel) {
        super(nivel);
        oleadaSiguiente=new SegundaOleada(nivel);

        cartelOleada1.setText("PRIMER OLEADA!");
        cartelOleada2.setText("PRIMER OLEADA!");


    }

    public void run() {
        try {

            inicializarCartelOleada();

            sleep(3500);

            retirarCartelOleada();

            sleep(1500);


            Enemigo enemigo;



            Random r = new Random();
            for (int i = 0; i < cantEnemigosDeOleada; i++) {
                int enemigoAleatorio = r.nextInt(nivel.getListaEnemigosSpawn().size());
                int tipoEnemigo = r.nextInt(10);
                if (tipoEnemigo < 4)
                    enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigoBoosted();
                else enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigo();
                enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
                agregarEnemigo(enemigo);

                sleep(3000);
            }

        }
        catch(InterruptedException e){ e.printStackTrace();}

    }


}
