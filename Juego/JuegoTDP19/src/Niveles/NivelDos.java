package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.*;
import FabricaObjetoMapaEvento.FabricaEventoLago;
import FabricaObjetoMapaEvento.FabricaEventoPiedra;
import Juego.Mapa;

import java.awt.*;
import java.util.Random;

public class NivelDos extends Nivel {

    public NivelDos() {
        super();
        nivelSiguiente=new NivelTres();

        cartelNivel1.setText("NIVEL DOS");
        cartelNivel2.setText("NIVEL DOS");

        rangoCantidadEnemigos = new Point(9,12);
    }

    public void llenarListaEnemigosSpawn() {

        listaEnemigosSpawn.add(FabricaEnemigoFallenAngel.getFabricaFallenAngel());
        listaEnemigosSpawn.add(FabricaEnemigoGolemTierra.getFabricaGolemTierra());
        listaEnemigosSpawn.add(FabricaEnemigoGolemFuego.getFabricaGolemFuego());

    }

    public void llenarListaEventos(){
        listaEventos.add(FabricaEventoPiedra.getFabricaEventoPiedra());
        listaEventos.add(FabricaEventoLago.getFabricaEventoLago());
    }

    public void comenzarNivel(){
        oleada.start();
    }



    public String getDireccionImagenFondoNivel(){
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL2.jpg";
        return direccion;
    }

}
