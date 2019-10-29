package FabricaDisparos;

import Entidad.Disparos.Disparo;

import Entidad.Disparos.GolpeCaballeroEscudo;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoGolpeCaballero extends FabricaDisparo {

    public FabricaDisparoGolpeCaballero(Personaje disparador) {
        super(disparador);
    }

    public void generarDisparo() {

        Disparo nuevoDisparo= new GolpeCaballeroEscudo(new Point(disparador.getPos().x,disparador.getPos().y),0,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();

    }
}
