package FabricaDisparos;

import Entidad.Disparo;

import Entidad.GolpeCaballeroEscudo;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoGolpeCaballero extends FabricaDisparo {

    public FabricaDisparoGolpeCaballero(Personaje disparador) {
        super(disparador);
    }

    @Override
    public void generarDisparo() {

        Disparo nuevoDisparo= new GolpeCaballeroEscudo(new Point(disparador.getPos().x+30,disparador.getPos().y+50),23,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();

    }
}
