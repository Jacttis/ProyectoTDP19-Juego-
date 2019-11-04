package Niveles.Oleada;

import Entidad.Enemigos.Enemigo;
import Niveles.*;
import Constantes.Constantes;
import java.awt.*;
import java.util.Random;

public class PrimerOleada extends Oleada {

    public PrimerOleada(Nivel nivel) {
        super(nivel);
        oleadaSiguiente=new SegundaOleada(nivel);

    }

    public void run() {

        Enemigo enemigo;

        try {

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
        catch(InterruptedException e){}

    }
}
