package FabricaBotones.BotonesObjetos;

import Entidad.PowerUp.AgujeroNegro;
import Entidad.PowerUp.ObjetoPrecioso;

import java.awt.*;

public class BotonAgujeroNegro extends BotonObjeto {

    public static BotonAgujeroNegro instance = null;

    public static BotonAgujeroNegro getBotonAgujeroNegro(){
        if(instance==null)
            instance = new BotonAgujeroNegro();

        return instance;
    }

    private BotonAgujeroNegro(){
        super("Sprites/Objetos/PotenciadoObjeto.png");
    }

    public ObjetoPrecioso getObjeto() {
        return new AgujeroNegro();
    }
}
