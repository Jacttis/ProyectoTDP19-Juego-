package FabricaBotones.BotonesObjetos;

import Entidad.PowerUp.ObjetosPreciosos.AgujeroNegro;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;

public class BotonAgujeroNegro extends BotonObjeto {

    public static BotonAgujeroNegro instance = null;

    public static BotonAgujeroNegro getBotonAgujeroNegro(){
        if(instance==null)
            instance = new BotonAgujeroNegro();

        return instance;
    }

    private BotonAgujeroNegro(){
        super("src/Sprites/Objetos/Aguajero/SpriteBoton.png");
    }

    public ObjetoPrecioso getObjeto() {
        return new AgujeroNegro();
    }
}
