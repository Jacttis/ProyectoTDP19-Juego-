package Entidad;


import FabricaDisparos.FabricaDisparo;

import java.awt.*;
import javax.swing.ImageIcon;

public class CaballeroEscudo extends Aliado {

    public CaballeroEscudo(int vida, int damage, float velocidadAtaque, String Descripcion, FabricaDisparo fabricaDisparos){
        super(vida, damage, velocidadAtaque, Descripcion, fabricaDisparos);

        width=100;
        height=140;

        imagen[0]=new ImageIcon("Sprites\\CharacterSprites\\GIFs\\StillTrueCab.gif");
        imagen[1]=new ImageIcon("Sprites\\CharacterSprites\\GIFs\\StillTrueCab.gif");
        imagen[2]=new ImageIcon("Sprites\\CharacterSprites\\GIFs\\StillTrueCab.gif");
    }

    public Disparo disparar() {

        return null;
    }

}
