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
    public NivelNulo() {
        super();
        nivelSiguiente=null;
    }

    @Override
    public void comenzarNivel() {
        ganar=new JLabel("Ganaste!!");
        ganar.setBounds(850,80,3000,400);
        ganar.setForeground(Color.red);
        Mapa.getMapa().getGui().add(ganar);
        ganar.setFont(new Font("Times New Roman", 4,100));
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Tienda.getTienda().gameOver();
        Mapa.getMapa().getGui().dispose();
        Juego.getJuego().gameOver();
        Mapa.getMapa().gameOver();
        Menu.getMenu();

    }

    public void llenarListaEnemigosSpawn() {


    }

    @Override
    public void llenarListaEventos() {

    }


    public String getDireccionImagenFondoNivel(){
        String direccion="Sprites/Mapa/Mapa2DisenioNIVEL2.jpg";
        return direccion;
    }
}
