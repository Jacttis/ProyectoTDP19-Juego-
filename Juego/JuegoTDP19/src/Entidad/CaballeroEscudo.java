package Entidad;


import Constantes.Constantes;
import Estados.Quieto;
import FabricaDisparos.FabricaDisparo;
import Graficos.BarraDeVida;
import Graficos.Grafico;
import Graficos.SpriteEntidad;

import java.awt.*;
import javax.swing.*;

public class CaballeroEscudo extends Aliado {

    public CaballeroEscudo(int vida, int damage, float velocidadAtaque,int rango, String Descripcion){
        super(vida, damage, velocidadAtaque,rango, Descripcion);

        width= Constantes.ALIADOX;
        height=Constantes.ALIADOY;

        estado=new Quieto(this);

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");
        imagen[1]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");
        imagen[2]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");
        imagen[3]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,10,5);
        listaGraficos.add(barraVida);
        listaGraficos.add(sprites);
    }


    public void atacar() {

    }

    public Entidad clone(){
        return new CaballeroEscudo(vidaTotal,damage,velocidadAtaque,rango,descripcion);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-20,height-70);
    }
}
