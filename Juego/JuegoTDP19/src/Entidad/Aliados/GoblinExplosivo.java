package Entidad.Aliados;

import Constantes.Constantes;
import Estados.Caminando;
import FabricaDisparos.FabricaExplosionGoblin;
import Graficos.TiposGrafico.BarraDeVida;
import Graficos.TiposGrafico.Grafico;
import Graficos.TiposGrafico.SpriteEntidad;
import Inteligencia.InteligenciaAliadoMovil;
import Juego.Mapa;
import Tienda.ParCelda;

import javax.swing.*;
import java.awt.*;

public class GoblinExplosivo extends Aliado {


    /**
     * Inicializa un GoblinExplosivo con sus correspondientes atributos y utilizando el constructor mas general
     * de Personaje.
     *
     * Inicializa el atributo 'estado' como un nuevo estado Caminando.
     * Inicializa el atributo 'IA' como una nueva Inteligencia InteligenciaAliadoMovil.
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

    public GoblinExplosivo(int vida, int damage, float velocidadAtaque,int rango, double velocidad, String Descripcion){
        super(vida, damage, velocidadAtaque,rango, velocidad, Descripcion);

        width= Constantes.ALIADOX;
        height=Constantes.ALIADOY;

        precio = 8;

        imagen[0]=new ImageIcon("src/Sprites/GoblinExplosivo/corriendoChico.gif");
        imagen[1]=new ImageIcon("src/Sprites/GoblinExplosivo/corriendoChico.gif");
        imagen[2]=new ImageIcon("");
        imagen[3]=new ImageIcon("src/Sprites/GoblinExplosivo/corriendoChico.gif");

        Grafico sprites=new SpriteEntidad(this,imagen,0,20);
        Grafico barraVida=new BarraDeVida(this,10,10);

        sprites.getGrafico().addMouseListener(new MouseOyenteAliado(this));

        componentesGraficas.agregarGrafico(sprites);
        componentesGraficas.agregarGrafico(barraVida);

        estado=new Caminando(this);
        IA=new InteligenciaAliadoMovil(this);

    }

    /**
     *
     * Implementacion del metodo abstracto atacar ubicado en Personaje.
     *
     * Si puede atacar genera un disparo mediante la fabrica de Disparos la cual lo insertara en el mapa
     * y se 'suicida' asignandole el valor 0 a vidaActual.
     *
     */

    public void atacar() {

        if(puedeAtacar) {
            FabricaExplosionGoblin.getFabricaExplosionGoblin().generarDisparo(this);
            vidaActual=0;
        }
    }

    /**
     * Redefinicion de eliminarse mas general,
     * ya que este aliado en ningun momento ocupa un celda,
     * por lo tanto al eliminarse solo debe eliminarse del Mapa.
     *
     */

    public void eliminarse(){
        Mapa.getMapa().eliminarEntidad(this);
    }


    /**
     * Redefinicion de posicionar mas general,
     * ya que este aliado en ningun momento ocupa un celda,
     * por lo tanto al posicionarse solo debe asignarse la posicion de la
     * celda parametrizada, pero no ocuparla.
     *
     */

    public void posicionar(ParCelda celda){
        pos.setLocation(celda.getPos());
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
