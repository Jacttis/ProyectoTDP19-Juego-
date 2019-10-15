package Entidad;

import FabricaDisparos.FabricaDisparoGolpeEnemigo;

import javax.swing.*;
import java.awt.*;

public class ReaperMan extends Enemigo {

    public ReaperMan(int vida,int damage, float velocidadAtaque,double velocidad,int puntos,int oro){

        super(vida,damage,velocidadAtaque,velocidad,puntos,oro);
        fabricaDisparo=new FabricaDisparoGolpeEnemigo(this);

        imagen[0] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/walkingReaperMan2.gif");
        imagen[1] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/slashingReaperMan3.gif");
        imagen[2] = new ImageIcon("Sprites/CharacterSprites/ReaperMan/dyingReaperMan3.gif");

    }

    /**
     * Redefinicion de getEtiquetaVida mas general
     *
     * @return JLabel etiquetaVida
     */
    public JLabel getEtiquetaVida(){
        if(this.etiquetaVida==null){
            this.etiquetaVida=new JLabel();
            this.etiquetaVida.setBounds(pos.x,pos.y+this.height,80,5);
            this.etiquetaVida.setOpaque(true);
            this.etiquetaVida.setBackground(Color.GREEN);
        }

        return etiquetaVida;
    }

    /**
     * Redefinicion de actualizarEtiquetaVida mas general.
     *
     * @param n
     */

    public void actualizarEtiquetaVida(int n){

        if(etiquetaVida!=null) {
            etiquetaVida.setBounds(pos.x+(this.width-110), pos.y+(this.height-10) , (etiquetaVida.getWidth()-((n*80)/vidaTotal)), etiquetaVida.getHeight());

            if (vidaActual < 70) {
                if (vidaActual < 40)
                    etiquetaVida.setBackground(Color.RED);
                else etiquetaVida.setBackground(Color.YELLOW);
            }
        }
    }

    public Entidad clone(){
        return new ReaperMan(vidaTotal,damage,velocidadAtaque,velocidad,puntos,oroPremio);
    }
    /**
     *
     * Implementacion del metodo abstracto atacar ubicado en Personaje.
     * Si puede atacar genera un golpe mediante la fabrica de Disparos la cual lo insertara en el mapa.
     *
     */

    public void atacar(){

        if(puedeAtacar)
            fabricaDisparo.generarDisparo();
    }

    /**
     * Redefinicion del getHitbox mas general.
     *
     * Devuelve un rectangulo que reprensenta el hitbox del personaje.
     *
     * @return Rectangle
     */

    public Rectangle getHitBox(){
        return new Rectangle(pos.x+40,pos.y,width-30,height-70);
    }

}
