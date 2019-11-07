package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import FabricaObjetoMapaEvento.FabricaEventoLago;
import FabricaObjetoMapaEvento.FabricaEventoPiedra;
import Juego.Mapa;

import java.awt.*;
import java.util.Random;

public class NivelTres extends Nivel {

    public NivelTres() {
        super();
        nivelSiguiente=new NivelNulo();

        cartelNivel1.setText("NIVEL TRES");
        cartelNivel2.setText("NIVEL TRES");

        rangoCantidadEnemigos = new Point(10,15);
    }


    public void comenzarNivel() {
        oleada.start();
    }

    public void llenarListaEnemigosSpawn() {

        listaEnemigosSpawn.add(FabricaEnemigoFallenAngel.getFabricaFallenAngel());
        listaEnemigosSpawn.add(FabricaEnemigoFallenAngelBlanco.getFabricaFallenAngelBlanco());
        listaEnemigosSpawn.add(FabricaEnemigoGolemFuego.getFabricaGolemFuego());
        listaEnemigosSpawn.add(FabricaEnemigoReaperMan.getFabricaReaperMan());

    }

    public void llenarListaEventos(){
        listaEventos.add(FabricaEventoPiedra.getFabricaEventoPiedra());
        listaEventos.add(FabricaEventoLago.getFabricaEventoLago());
    }



    public String getDireccionImagenFondoNivel(){
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL3.jpg";
        return direccion;
    }
}
