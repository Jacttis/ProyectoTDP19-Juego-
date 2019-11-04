package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import Juego.Mapa;

import java.awt.*;
import java.util.Random;

public class NivelTres extends Nivel {

    public NivelTres() {
        super();
        nivelSiguiente=new NivelNulo();
    }

    public void llenarListaEnemigosSpawn() {

        listaEnemigosSpawn.add(FabricaEnemigoFallenAngel.getFabricaFallenAngel());
        listaEnemigosSpawn.add(FabricaEnemigoFallenAngelBlanco.getFabricaFallenAngelBlanco());
        listaEnemigosSpawn.add(FabricaEnemigoGolemFuego.getFabricaGolemFuego());
        listaEnemigosSpawn.add(FabricaEnemigoReaperMan.getFabricaReaperMan());

    }

    public void run() {


        try {

            oleada.setEnemigosAGenerar(7);

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



            oleada.setEnemigosAGenerar(8);

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


            oleada.setEnemigosAGenerar(10);


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
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL3.jpg";
        return direccion;
    }
}
