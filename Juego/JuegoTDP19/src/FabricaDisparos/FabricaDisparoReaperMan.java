package FabricaDisparos;

import Entidad.Disparo;
import Entidad.DisparoMagoHielo;
import Entidad.DisparoReaperMan;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoReaperMan extends FabricaDisparo {


    public FabricaDisparoReaperMan(Personaje disparador){
        super(disparador);

    }


    public void generarDisparo() {

        Disparo nuevoDisparo=new DisparoReaperMan(new Point(disparador.getPos().x+28,disparador.getPos().y+40),18,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
