package Entidad;

import java.awt.*;
import javax.swing.*;
import FabricaDisparos.FabricaDisparoGolpeEnemigo;

public class EnemigoFallenAngel extends  Enemigo {

    public EnemigoFallenAngel(int vida, int damage, float velocidadAtaque, int rango, double velocidad, int puntos, int oro){

        super(vida, damage, velocidadAtaque, rango, velocidad, puntos, oro);

        fabricaDisparo = new FabricaDisparoGolpeEnemigo(this);

        imagen[0] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/caminandoTrue.gif");
        imagen[1] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/atacandoTrue.gif");
        imagen[2] = new ImageIcon("Sprites/EnemiesSprites/FallenAngel/muerteTrue.gif");
        this.setWidth(160);

    }

    /**
     * Redefinicion de getEtiquetaVida mas general
     *
     * @return JLabel etiquetaVida
     */

    public void iniciarEtiquetaVida(){
        if(this.etiquetaVida==null){
            this.etiquetaVida=new JLabel();
            this.etiquetaVida.setBounds(pos.x+20,pos.y+this.height,80,5);
            this.etiquetaVida.setOpaque(true);
            this.etiquetaVida.setBackground(Color.GREEN);
            this.graficos[1]=etiquetaVida;
        }
    }

    /**
     * Redefinicion de actualizarEtiquetaVida mas general.
     *
     * @param n
     */

    public void actualizarEtiquetaVida(int n){

        if(etiquetaVida!=null) {
            etiquetaVida.setBounds(pos.x+(this.width-90), pos.y+(this.height-10) , (etiquetaVida.getWidth()-((n*80)/vidaTotal)), etiquetaVida.getHeight());

            if (vidaActual < 70) {
                if (vidaActual < 40)
                    etiquetaVida.setBackground(Color.RED);
                else etiquetaVida.setBackground(Color.YELLOW);
            }
        }
    }


    /**
     * Implementacion del metodo abstracto clone en Entidad.
     *
     * Clona a la entidad y la devuelve.
     *
     * @return Entidad
     */

    public Entidad clone(){
        return new EnemigoFallenAngel(vidaTotal,damage,velocidadAtaque,rango,velocidad,puntos,oroPremio);
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
