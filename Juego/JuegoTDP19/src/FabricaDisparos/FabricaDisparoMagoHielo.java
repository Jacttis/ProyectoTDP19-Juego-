package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.DisparoMagoHielo;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoMagoHielo extends FabricaDisparo{

    private static FabricaDisparoMagoHielo instance = null;

    public static FabricaDisparoMagoHielo getFabricaDisparoMagoHielo(){
        if(instance == null)
            instance = new FabricaDisparoMagoHielo();

        return instance;
    }

    private FabricaDisparoMagoHielo(){
        super();
    }


    /**
     * Genera un disparo DisparoMagoHielo con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {

        Disparo nuevoDisparo=new DisparoMagoHielo(new Point(disparador.getPos().x+28,disparador.getPos().y+40),15,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
