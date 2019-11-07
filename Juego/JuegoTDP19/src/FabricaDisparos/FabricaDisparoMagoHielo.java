package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.DisparoMagoHielo;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoMagoHielo extends FabricaDisparo{

    protected Disparo disparoMagoHielo;

    public FabricaDisparoMagoHielo(Personaje disparador){
        super(disparador);

    }


    public void generarDisparo() {

        Disparo nuevoDisparo=new DisparoMagoHielo(new Point(disparador.getPos().x+28,disparador.getPos().y+40),15,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
