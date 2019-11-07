package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.DisparoArqueroPRO;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoArqueroPRO extends FabricaDisparo {


    public FabricaDisparoArqueroPRO(Personaje disparador){
        super(disparador);

    }


    public void generarDisparo() {

        Disparo nuevoDisparo= new DisparoArqueroPRO(new Point(disparador.getPos().x+30,disparador.getPos().y+80),20,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
