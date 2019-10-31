package Entidad.PowerUp;

import Colisionadores.ColisionadorAliado;
import Colisionadores.ColisionadorAliadoConCampoProteccion;
import Colisionadores.ColisionadorEnemigoConCampoProteccion;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Entidad.Entidad;
import Entidad.Personaje;
import Graficos.Grafico;
import Graficos.Potenciado;
import Graficos.PotenciadoBarrera;
import Graficos.SpriteEntidad;
import Juego.Mapa;

import javax.swing.*;
import java.awt.*;

public class CampoProteccion extends MagiaTemporal {

    public CampoProteccion(Point pos, int duracion){
        super(pos,duracion);

        imagen[0]=new ImageIcon("Sprites/CampoProteccion/campoProteccionAliado.png");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);

        sprites.getGrafico().addMouseListener(new MouseOyentePowerUp(this));

        componentesGraficas.agregarGrafico(sprites);
    }

    public void afectarPortador(Enemigo portador){

        PotenciadoBarrera potenciadoBarrera= new PotenciadoBarrera(portador,30,0,true);
        portador.getComponentesGraficas().agregarGrafico(potenciadoBarrera);
        portador.setColisionador(new ColisionadorEnemigoConCampoProteccion(portador,this));

    }

    public void aplicarEfecto(Personaje personaje){
        personaje.disminuirVida(personaje.getVida());
    }

    public void afectarPersonaje(Aliado personaje) {
        //agregar grafico



        graficoRepresentativo= new PotenciadoBarrera(personaje,0,0,false);
        personaje.getComponentesGraficas().agregarNuevoGrafico(graficoRepresentativo);

        personaje.setColisionador(new ColisionadorAliadoConCampoProteccion(personaje,this));
        tiempoAfecto=new HiloPowers(this,personaje);
        tiempoAfecto.start();

    }


    public void desafectarPersonaje(Aliado personaje) {
        personaje.getComponentesGraficas().eliminarGrafico(graficoRepresentativo);

        personaje.setColisionador(new ColisionadorAliado(personaje));
    }


    public Entidad clone() {
        return new CampoProteccion(pos,duracion);
    }
}
