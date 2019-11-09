package Entidad.Aliados;


import Constantes.Constantes;
import FabricaDisparos.FabricaDisparoGolpeCaballero;
import Graficos.TiposGrafico.BarraDeVida;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Tienda.ParCelda;

import java.awt.*;
import javax.swing.*;

public class CaballeroEscudo extends Aliado {

    /**
     * Inicializa un CaballeroEscudo con sus correspondientes atributos y utilizando el constructor mas general
     * de Personaje.
     *
     * Inicializa cada componente de arreglo de imagenes y crea un Grafico SpriteEntidad y BarraDeVida para
     * luego agregarlos a la lista de graficos componentesGraficas.
     *
     * Tambien le asigna un mouseListener al Grafico Sprites.
     *
     * @param vida
     * @param damage
     * @param velocidadAtaque
     * @param rango
     * @param velocidad
     * @param Descripcion
     */

    public CaballeroEscudo(int vida, int damage, float velocidadAtaque, int rango, double velocidad, String Descripcion){
        super(vida, damage, velocidadAtaque,rango, velocidad, Descripcion);

        width= Constantes.ALIADOX;
        height=Constantes.ALIADOY;

        precio = 3;


        imagen[0]=new ImageIcon("src/Sprites/CharacterSprites/GIFs/CaballeroEscudo/StillTrueCab.gif");
        imagen[1]=new ImageIcon("src/Sprites/CharacterSprites/GIFs/CaballeroEscudo/atacandoTrue.gif");
        imagen[2]=new ImageIcon("src/Sprites/CharacterSprites/GIFs/CaballeroEscudo/muerteTRUE.gif");
        imagen[3]=new ImageIcon("src/Sprites/CharacterSprites/GIFs/CaballeroEscudo/StillTrueCab.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        Grafico barraVida=new BarraDeVida(this,10,5);

        sprites.getGrafico().addMouseListener(new MouseOyenteAliado(this));

        componentesGraficas.agregarGrafico(sprites);
        componentesGraficas.agregarGrafico(barraVida);


    }

    /**
     *
     * Implementacion del metodo abstracto atacar ubicado en Personaje.
     *
     * Si puede atacar genera un disparo mediante la fabrica de Disparos la cual lo insertara en el mapa.
     *
     */

    public void atacar() {

        if(puedeAtacar)
            FabricaDisparoGolpeCaballero.getFabricaDisparoGolpeCaballero().generarDisparo(this);
    }

    /**
     * Redefinicion del posicionar mas general.
     * Lo posicion mas exactamente en base al sprite del Aliado.
     * @param celda
     */

    public void posicionar(ParCelda celda){
        super.posicionar(celda);
        pos.setLocation(celda.getPos().x,celda.getPos().y+8);

    }

    /**
     * Redefinicion del getHitbox mas general
     *
     * Devuelve un rectangulo que reprensenta el hitbox del personaje.
     *
     * @return Rectangle
     */

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-20,height-50);
    }
}
