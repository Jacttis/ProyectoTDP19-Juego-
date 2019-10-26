package Entidad;


import Colisionadores.Colisionador;
import Colisionadores.ColisionadorEnemigo;
import Colisionadores.ColisionadorGolpeEnemigo;
import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;
import Inteligencia.InteligenciaGolpeEnemigo;

import javax.swing.*;
import java.awt.*;

public class GolpeEnemigo extends Disparo {

    public GolpeEnemigo(Point pos, int damage,int width,int height, Personaje disparador) {
        super(pos, 0, damage,disparador);
        IA=new InteligenciaGolpeEnemigo(this);
        colisionador=new ColisionadorGolpeEnemigo(this);
        this.width=width;
        this.height=height;

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/DisparoMagoHieloTR.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,0);
        componentesGraficas.agregarNuevoGrafico(sprites);

    }

    /**
     * Definicion del metodo abstracto mas general.
     * Clona la entidad y la retorna.
     *
     *
     * @return Entidad
     */

    public Entidad clone() {
        return new GolpeEnemigo(pos,damage,width,height,disparador);
    }

    /**
     * Redefinicion del serChocado en Disparo.
     *
     * Le envia el mensaje afectarGolpeEnemigo (con esta instancia como parametro) al
     * colisionador parametrizado.
     *
     * @param colisionador
     */

    public void serChocado(Colisionador colisionador){
        colisionador.afectarGolpeEnemigo(this);
    }
}
