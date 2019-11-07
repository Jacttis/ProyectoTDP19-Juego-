package Niveles.Oleada;

import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import FabricaEnemigo.FabricaEnemigoReaperMan;
import FabricaObjetoMapaEvento.FabricaMapaEvento;
import Juego.Mapa;
import Niveles.*;
import Constantes.Constantes;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
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

            sleep(1000);

            nivel.inicializarCartelNivel();

            sleep(2700);
            nivel.retirarCartelNivel();

            sleep(350);

            inicializarCartelOleada();

            sleep(1700);

            retirarCartelOleada();

            sleep(700);



            Random r = new Random();

            //Mediante un numero aleatorio decido si agregar o no un evento aleatorio, el cual se obtendra tambien
            // de forma aleatoria sacandolo de la lista de eventos que tiene la clase Nivel como atributo.
            int posibilidadEventoAleatorio = r.nextInt(10);
            if(posibilidadEventoAleatorio<13) {
                LinkedList<FabricaMapaEvento> listaEventos = nivel.getListaEventos();
                ObjetoMapa evento = listaEventos.get(r.nextInt(listaEventos.size())).getEvento();
                Mapa.getMapa().agregarEntidad(evento);
            }

            Enemigo enemigo;
            int cantEnemigos = getCantidadEnemigosAleatoria();

            for (int i = 0; i < cantEnemigos ; i++) {
                int enemigoAleatorio = r.nextInt(nivel.getListaEnemigosSpawn().size());
                int tipoEnemigo = r.nextInt(10);
                if (tipoEnemigo < 4)
                    enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigoBoosted();
                else enemigo = nivel.getListaEnemigosSpawn().get(enemigoAleatorio).crearEnemigo();
                enemigo.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
                agregarEnemigo(enemigo);

                sleep(1500);
            }

            int posibilidadReaper = r.nextInt(10);
            if(posibilidadReaper<4){
                Enemigo reaper = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigo();
                reaper.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
                agregarEnemigo(reaper);
            }

            while(true){

                if(verificarEnemigoGano()){
                    Mapa.getMapa().perdio();
                    break;
                }
                else
                    if((!enemigosGenerados.isEmpty()) && (verificarMuerteDeOleada())){
                        nivel.setOleada(oleadaSiguiente);
                        break;
                    }

            }

            if(!verificarEnemigoGano())
                nivel.comenzarNivel();



        }
        catch(InterruptedException e){ e.printStackTrace();}

    }


}
