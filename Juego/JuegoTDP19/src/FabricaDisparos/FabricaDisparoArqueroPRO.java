package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.DisparoArqueroPRO;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoArqueroPRO extends FabricaDisparo {


    private static FabricaDisparoArqueroPRO instance = null;

    public static FabricaDisparoArqueroPRO getFabricaDisparoArqueroPRO(){
        if(instance == null)
            instance = new FabricaDisparoArqueroPRO();

        return instance;
    }

    private FabricaDisparoArqueroPRO(){
        super();
    }


    /**
     * Genera un disparo DisparoArqueroPRO con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {

        Disparo nuevoDisparo= new DisparoArqueroPRO(new Point(disparador.getPos().x+20,disparador.getPos().y),20,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
