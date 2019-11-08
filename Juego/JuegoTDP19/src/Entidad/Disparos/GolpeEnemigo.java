package Entidad.Disparos;


import Colisionadores.Colisionador;
import Colisionadores.ColisionadoresDisparos.ColisionadorDisparoEnemigo;
import Entidad.*;
import Inteligencia.InteligenciaGolpeEnemigo;

import java.awt.*;

public class GolpeEnemigo extends Disparo {

    /**
     * Crea un DisparoArqueroHumano.
     *
     * Asigna los atributos correspondientes.
     *
     * Inicializa el atributo IA como una nueva Inteligencia InteligenciaGolpeEnemigo
     * con este mismo GolpeEnemigo parametrizado.
     *
     * Inicializa el atributo colisionador como un nuevo Colisionador ColisionadorDisparoEnemigo
     * con este mismo GolpeEnemigo parametrizado.
     *
     * @param pos
     * @param velocidad
     * @param damage
     * @param disparador
     */

    public GolpeEnemigo(Point pos, double velocidad, int damage, Personaje disparador) {
        super(pos, velocidad, damage,disparador);
        IA=new InteligenciaGolpeEnemigo(this);
        colisionador=new ColisionadorDisparoEnemigo(this);

        this.width=disparador.getWidth();
        this.height=disparador.getHeight()/2;


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
