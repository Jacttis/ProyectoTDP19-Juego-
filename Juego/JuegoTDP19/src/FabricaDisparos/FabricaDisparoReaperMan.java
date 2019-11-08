package FabricaDisparos;

import Entidad.*;

import Entidad.Disparos.DisparoReaperMan;
import Entidad.Disparos.Disparo;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoReaperMan extends FabricaDisparo {


    private static FabricaDisparoReaperMan instance = null;

    public static FabricaDisparoReaperMan getFabricaDisparoReaperMan(){
        if(instance == null)
            instance = new FabricaDisparoReaperMan();

        return instance;
    }

    private FabricaDisparoReaperMan(){
        super();
    }


    /**
     * Genera un disparo DisparoReaperMan con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {

        Disparo nuevoDisparo=new DisparoReaperMan(new Point(disparador.getPos().x+28,disparador.getPos().y+40),20,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
