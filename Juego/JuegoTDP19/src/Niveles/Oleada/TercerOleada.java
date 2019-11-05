package Niveles.Oleada;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import Niveles.Nivel;

import java.awt.*;
import java.util.Random;

public class TercerOleada extends Oleada {

    public TercerOleada(Nivel nivel) {
        super(nivel);
        oleadaSiguiente=null;

        cartelOleada1.setText("TERCER OLEADA!");
        cartelOleada2.setText("TERCER OLEADA!");
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
                if (tipoEnemigo < 6)
                    enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigoBoosted();
                else enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigo();
                enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
                agregarEnemigo(enemigo);

                sleep(3000);
            }

        }
        catch(InterruptedException e){}

    }
}
