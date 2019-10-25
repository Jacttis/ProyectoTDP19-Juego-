package FabricaDisparos;

import Entidad.Disparo;
import Entidad.DisparoArqueroHumano;
import Entidad.DisparoArqueroPRO;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoArqueroPRO extends FabricaDisparo {


    public FabricaDisparoArqueroPRO(Personaje disparador){
        super(disparador);

    }


    public void generarDisparo() {

        Disparo nuevoDisparo= new DisparoArqueroPRO(new Point(disparador.getPos().x+30,disparador.getPos().y+50),23,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
