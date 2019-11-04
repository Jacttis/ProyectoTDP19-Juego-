package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import Juego.Mapa;

import java.awt.*;
import java.util.Random;

public class NivelDos extends Nivel {

    public NivelDos() {
        super();
        nivelSiguiente=new NivelTres();
    }

    public void llenarListaEnemigosSpawn() {

        listaEnemigosSpawn.add(FabricaEnemigoFallenAngel.getFabricaFallenAngel());
        listaEnemigosSpawn.add(FabricaEnemigoGolemTierra.getFabricaGolemTierra());
        listaEnemigosSpawn.add(FabricaEnemigoGolemFuego.getFabricaGolemFuego());

    }

    public void run() {


        try {

            oleada.setEnemigosAGenerar(5);

            oleada.start();

            while (true) {
                if ((!oleada.getEnemigosGenerados().isEmpty()) && (oleada.verificarMuerteDeOleada())) {
                    oleada = oleada.getSiguiente();

                    break;

                } else if (oleada.verificarEnemigoGano()) {
                    Mapa.getMapa().perdio();
                    break;
                }
                sleep(1000);

            }

            sleep(1000);

            listaEnemigosSpawn.add(FabricaEnemigoFallenAngelBlanco.getFabricaFallenAngelBlanco());

            Enemigo reaper = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigo();
            reaper.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
            oleada.agregarEnemigo(reaper);

            oleada.setEnemigosAGenerar(6);

            oleada.start();

            while (true) {
                if ((!oleada.getEnemigosGenerados().isEmpty()) && (oleada.verificarMuerteDeOleada())) {
                    oleada = oleada.getSiguiente();

                    break;

                } else if (oleada.verificarEnemigoGano()) {
                    Mapa.getMapa().perdio();
                    break;
                }
                sleep(1000);

            }

            sleep(1000);


            oleada.setEnemigosAGenerar(7);

            Enemigo reaperBoosted = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigoBoosted();
            reaperBoosted.posicionar(new Point(Constantes.ENEMIGOS_PX, obtenerPosicionAleatoriaEnY()));
            oleada.agregarEnemigo(reaperBoosted);

            oleada.start();


            while (true) {
                if ((!oleada.getEnemigosGenerados().isEmpty()) && (oleada.verificarMuerteDeOleada())) {
                    oleada = oleada.getSiguiente();
                    break;
                } else if (oleada.verificarEnemigoGano()) {
                    Mapa.getMapa().perdio();
                    break;
                }
                sleep(1000);

            }

            Mapa.getMapa().terminoNivel();

        }
        catch(InterruptedException e) {}

    }


    public String getDireccionImagenFondoNivel(){
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL2.jpg";
        return direccion;
    }

}
