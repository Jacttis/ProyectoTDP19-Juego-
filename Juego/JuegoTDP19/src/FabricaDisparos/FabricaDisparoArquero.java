package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.DisparoArqueroHumano;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoArquero extends FabricaDisparo {

    private static FabricaDisparoArquero instance = null;

    public static FabricaDisparoArquero getFabricaDisparoArquero(){
        if(instance == null)
            instance = new FabricaDisparoArquero();

        return instance;
    }

    private FabricaDisparoArquero(){
        super();
    }

    /**
     * Genera un disparo DisparoArqueroHumano con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {

        Disparo nuevoDisparo= new DisparoArqueroHumano(new Point(disparador.getPos().x+30,disparador.getPos().y+50),25,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
