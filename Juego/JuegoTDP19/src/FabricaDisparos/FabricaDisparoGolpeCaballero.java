package FabricaDisparos;

import Entidad.Disparos.Disparo;

import Entidad.Disparos.GolpeCaballeroEscudo;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoGolpeCaballero extends FabricaDisparo {

    private static FabricaDisparoGolpeCaballero instance = null;

    public static FabricaDisparoGolpeCaballero getFabricaDisparoGolpeCaballero(){
        if(instance == null)
            instance = new FabricaDisparoGolpeCaballero();

        return instance;
    }

    private FabricaDisparoGolpeCaballero(){
        super();
    }

    /**
     * Genera un disparo GolpeCaballeroEscudo con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {

        Disparo nuevoDisparo= new GolpeCaballeroEscudo(new Point(disparador.getPos().x,disparador.getPos().y),0,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();

    }
}
