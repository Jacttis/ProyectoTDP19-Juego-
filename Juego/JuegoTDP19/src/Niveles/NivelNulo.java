package Niveles;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import FabricaEnemigo.FabricaEnemigoFallenAngel;
import FabricaEnemigo.FabricaEnemigoGolemFuego;
import FabricaEnemigo.FabricaEnemigoGolemTierra;
import Juego.Juego;
import Juego.Mapa;
import Menu.Menu;
import Tienda.Tienda;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NivelNulo extends Nivel {
    JLabel ganar;

    /**
     * Crea un Nuivel Nulo el cual este funciona para dar Fin al juego
     */
    public NivelNulo() {
        super();
        nivelSiguiente=null;
    }

    @Override
    /**
     * comenzarNivel en este Nivel Nulo finaliza el juego y te lleva al menu de opciones.
     */
    public void comenzarNivel() {
        Juego.getJuego().gameOver("GANASTE!");

    }

    public void llenarListaEnemigosSpawn() {


    }

    public void llenarListaEventos() {

    }


    public String getDireccionImagenFondoNivel(){
        String direccion="src/Sprites/Mapa/Mapa2DisenioFIN.jpg";
        return direccion;
    }
}
