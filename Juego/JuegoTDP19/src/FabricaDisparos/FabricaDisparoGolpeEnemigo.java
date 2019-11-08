package FabricaDisparos;

import Entidad.Disparos.GolpeEnemigo;
import Entidad.Personaje;
import Juego.Mapa;

public class FabricaDisparoGolpeEnemigo extends FabricaDisparo {

    private static FabricaDisparoGolpeEnemigo instance = null;

    public static FabricaDisparoGolpeEnemigo getFabricaDisparoGolpeEnemigo(){
        if(instance == null)
            instance = new FabricaDisparoGolpeEnemigo();

        return instance;
    }

    private FabricaDisparoGolpeEnemigo(){
        super();
    }

    /**
     * Genera un disparo GolpeEnemigo con las caracteristicas necesarias de disparador
     * luego lo agrega al Mapa y inicia el hilo para controlar que el personaje no pueda
     * disparar en base a su velocidad de Ataque
     *
     * @param disparador
     */

    public void generarDisparo(Personaje disparador) {
        GolpeEnemigo golpeNuevo=new GolpeEnemigo(disparador.getPos(),0,disparador.getDamage(),disparador);
        Mapa.getMapa().agregarEntidad(golpeNuevo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
