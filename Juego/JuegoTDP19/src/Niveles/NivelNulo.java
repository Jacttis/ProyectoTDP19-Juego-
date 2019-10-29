package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.FabricaEnemigoFallenAngel;
import FabricaEnemigo.FabricaEnemigoGolemFuego;
import FabricaEnemigo.FabricaEnemigoGolemTierra;

import java.awt.*;
import java.util.Random;

public class NivelNulo extends Nivel {

    public NivelNulo() {
        super();
        nivelSiguiente=null;
    }

    public void llenarListaEnemigosSpawn() {


    }

    public void run() {

    }

    public String getDireccionImagenFondoNivel(){
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL2.jpg";
        return direccion;
    }
}
