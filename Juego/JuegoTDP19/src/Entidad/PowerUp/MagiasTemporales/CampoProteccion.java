package Entidad.PowerUp.MagiasTemporales;

import Colisionadores.ColisionadoresAliados.ColisionadorAliado;
import Colisionadores.ColisionadoresAliados.ColisionadorAliadoConCampoProteccion;
import Colisionadores.ColisionadoresEnemigos.ColisionadorEnemigoConCampoProteccion;
import Entidad.Aliados.Aliado;
import Entidad.Enemigos.Enemigo;
import Entidad.*;
import Entidad.Personaje;
import Entidad.PowerUp.MouseOyenteMagiaCaida;
import Graficos.Grafico;
import Graficos.PotenciadoBarrera;
import Graficos.SpriteEntidad;

import javax.swing.*;

public class CampoProteccion extends MagiaTemporal {

    public CampoProteccion(int duracion){
        super(duracion);

        imagen[0]=new ImageIcon("Sprites/Magia/BarreraPotenciado/barreraDrop2.png");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);

        sprites.getGrafico().addMouseListener(new MouseOyenteMagiaCaida(this));

        componentesGraficas.agregarGrafico(sprites);
    }

    public void afectarPortador(Personaje portador){

        PotenciadoBarrera potenciadoBarrera= new PotenciadoBarrera(portador,30,5);
        portador.getComponentesGraficas().agregarGrafico(potenciadoBarrera);
        portador.setColisionador(new ColisionadorEnemigoConCampoProteccion((Enemigo) portador,this));

    }

    public void aplicarEfecto(Personaje personaje){
        personaje.disminuirVida(personaje.getVida());
    }

    public void afectarPersonaje(Aliado personaje) {
        //agregar grafico



        graficoRepresentativo= new PotenciadoBarrera(personaje,0,0);
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
        return new CampoProteccion(duracion);
    }
}
