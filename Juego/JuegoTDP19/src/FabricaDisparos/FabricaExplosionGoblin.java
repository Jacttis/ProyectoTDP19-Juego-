package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.ExplosionGoblin;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaExplosionGoblin extends FabricaDisparo {

    public FabricaExplosionGoblin(Personaje disparador){
        super(disparador);
    }

    public void generarDisparo() {
        Disparo nuevoDisparo=new ExplosionGoblin(new Point(disparador.getPos().x,disparador.getPos().y),0,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);

        disparador.setPuedeAtacar(false);
    }
}
