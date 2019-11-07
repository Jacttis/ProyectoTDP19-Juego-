package Entidad.Aliados;

import Constantes.Constantes;
import Entidad.Entidad;
import Estados.Caminando;
import FabricaDisparos.FabricaExplosionGoblin;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaAliadoMovil;
import Juego.Mapa;
import Tienda.ParCelda;

import javax.swing.*;
import java.awt.*;

public class GoblinExplosivo extends Aliado {


    public GoblinExplosivo(int vida, int damage, float velocidadAtaque,int rango, double velocidad, String Descripcion){
        super(vida, damage, velocidadAtaque,rango, velocidad, Descripcion);

        width= Constantes.ALIADOX;
        height=Constantes.ALIADOY;

        precio = 8;

        imagen[0]=new ImageIcon("Sprites/GoblinExplosivo/corriendoChico.gif");
        imagen[1]=new ImageIcon("Sprites/GoblinExplosivo/corriendoChico.gif");
        imagen[2]=new ImageIcon("");
        imagen[3]=new ImageIcon("Sprites/GoblinExplosivo/corriendoChico.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,20);
        Grafico barraVida=new BarraDeVida(this,10,10);

        sprites.getGrafico().addMouseListener(new MouseOyenteAliado(this));

        componentesGraficas.agregarGrafico(sprites);
        componentesGraficas.agregarGrafico(barraVida);

        estado=new Caminando(this);
        IA=new InteligenciaAliadoMovil(this);

        fabricaDisparo=new FabricaExplosionGoblin(this);
    }


    public void atacar() {

        if(puedeAtacar) {
            fabricaDisparo.generarDisparo();
            vidaActual=0;
        }
    }

    public void eliminarse(){

        Mapa.getMapa().eliminarEntidad(this);
    }

    public void posicionar(ParCelda celda){
        pos.setLocation(celda.getPos());
    }

    public Entidad clone(){
        return new GoblinExplosivo(vidaTotal,damage,velocidadAtaque,rango,velocidad,descripcion);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-20,height-50);
    }


}
