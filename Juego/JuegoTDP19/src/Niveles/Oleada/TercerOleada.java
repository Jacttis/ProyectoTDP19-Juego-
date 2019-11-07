package Niveles.Oleada;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import FabricaEnemigo.FabricaEnemigoReaperMan;
import FabricaObjetoMapaEvento.FabricaMapaEvento;
import Juego.Mapa;
import Niveles.Nivel;

import java.awt.*;
import java.util.LinkedList;
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

            sleep(1700);

            retirarCartelOleada();

            sleep(700);


            Random r = new Random();
            //Mediante un numero aleatorio decido si agregar o no un evento aleatorio, el cual se obtendra tambien
            // de forma aleatoria sacandolo de la lista de eventos que tiene la clase Nivel como atributo.
            int posibilidadEventoAleatorio = r.nextInt(10);
            if(posibilidadEventoAleatorio<5) {
                LinkedList<FabricaMapaEvento> listaEventos = nivel.getListaEventos();
                ObjetoMapa evento = listaEventos.get(r.nextInt(listaEventos.size())).getEvento();
                Mapa.getMapa().agregarEntidad(evento);
            }

            Enemigo enemigo;
            int cantEnemigos = getCantidadEnemigosAleatoria()+2;

            for (int i = 0; i < cantEnemigos ; i++) {
                int enemigoAleatorio = r.nextInt(nivel.getListaEnemigosSpawn().size());
                int tipoEnemigo = r.nextInt(10);
                if (tipoEnemigo < 5)
                    enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigoBoosted();
                else enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigo();
                enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
                agregarEnemigo(enemigo);

                sleep(2000);
            }

            Enemigo reaper = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigo();
            reaper.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
            agregarEnemigo(reaper);

            while(true){

                if(verificarEnemigoGano()){
                    Mapa.getMapa().perdio();
                    break;
                }
                else
                if((!enemigosGenerados.isEmpty()) && (verificarMuerteDeOleada())){
                    sleep(3000);
                    nivel.cambiarNivel();
                    break;
                }
                sleep(1000);
            }


        }
        catch(InterruptedException e){}

    }
}
