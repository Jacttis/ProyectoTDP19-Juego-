package Niveles.Oleada;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import Niveles.Nivel;

import java.awt.*;
import java.util.Random;

public class SegundaOleada extends Oleada {

    public SegundaOleada(Nivel nivel) {
        super(nivel);
        oleadaSiguiente = new TercerOleada(nivel);

        cartelOleada1.setText("SEGUNDA OLEADA!");
        cartelOleada2.setText("SEGUNDA OLEADA!");
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
                if (tipoEnemigo < 5)
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
