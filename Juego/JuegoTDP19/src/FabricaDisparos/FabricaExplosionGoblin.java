package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.ExplosionGoblin;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaExplosionGoblin extends FabricaDisparo {

    private static FabricaExplosionGoblin instance = null;

    public static FabricaExplosionGoblin getFabricaExplosionGoblin(){
        if(instance == null)
            instance = new FabricaExplosionGoblin();

        return instance;
    }

    private FabricaExplosionGoblin(){
        super();
    }

    /**
     * Genera un disparo ExplosionGoblin con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {
        Disparo nuevoDisparo=new ExplosionGoblin(new Point(disparador.getPos().x,disparador.getPos().y),0,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);

        disparador.setPuedeAtacar(false);
    }
}
