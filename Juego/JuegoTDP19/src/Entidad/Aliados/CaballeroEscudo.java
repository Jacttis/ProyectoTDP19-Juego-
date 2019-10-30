package Entidad.Aliados;


import Constantes.Constantes;
import Entidad.Entidad;
import FabricaDisparos.FabricaDisparoGolpeCaballero;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Tienda.ParCelda;

import java.awt.*;
import javax.swing.*;

public class CaballeroEscudo extends Aliado {

    public CaballeroEscudo(int vida, int damage, float velocidadAtaque, int rango, double velocidad, String Descripcion){
        super(vida, damage, velocidadAtaque,rango, velocidad, Descripcion);

        width= Constantes.ALIADOX;
        height=Constantes.ALIADOY;




        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/CaballeroEscudo/StillTrueCab.gif");
        imagen[1]=new ImageIcon("Sprites/CharacterSprites/GIFs/CaballeroEscudo/atacandoTrue.gif");
        imagen[2]=new ImageIcon("Sprites/CharacterSprites/GIFs/CaballeroEscudo/muerteTRUE.gif");
        imagen[3]=new ImageIcon("Sprites/CharacterSprites/GIFs/CaballeroEscudo/StillTrueCab.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,10,5);

        sprites.getGrafico().addMouseListener(new MouseOyenteAliado(this));

        componentesGraficas.agregarNuevoGrafico(sprites);
        componentesGraficas.agregarNuevoGrafico(barraVida);

        fabricaDisparo=new FabricaDisparoGolpeCaballero((this));
    }


    public void atacar() {

        if(puedeAtacar)
            fabricaDisparo.generarDisparo();

    }
    public void posicionar(ParCelda celda){
        super.posicionar(celda);
        pos.setLocation(celda.getPos().x,celda.getPos().y);

    }

    public Entidad clone(){
        return new CaballeroEscudo(vidaTotal,damage,velocidadAtaque,rango,velocidad,descripcion);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-20,height-70);
    }
}
