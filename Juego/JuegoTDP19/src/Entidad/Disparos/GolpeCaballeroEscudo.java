package Entidad.Disparos;

import Entidad.*;
import Inteligencia.InteligenciaDisparoAliado;

import java.awt.*;

public class GolpeCaballeroEscudo extends Disparo {

    /**
     * Crea un GolpeCaballeroEscudo.
     *
     * Asigna los atributos correspondientes.
     *
     * Inicializa el atributo IA como una nueva Inteligencia InteligenciaDisparoAliado
     * con este mismo DisparoArqueroHumano parametrizado.
     *
     * @param pos
     * @param velocidad
     * @param damage
     * @param disparador
     */

    public GolpeCaballeroEscudo(Point pos, double velocidad, int damage, Personaje disparador){
        super(pos, velocidad, damage, disparador);

        IA=new InteligenciaDisparoAliado(this);
        this.width=disparador.getWidth();
        this.height=disparador.getHeight();


    }


}
