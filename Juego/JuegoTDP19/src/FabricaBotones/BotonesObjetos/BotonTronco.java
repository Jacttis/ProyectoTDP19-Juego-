package FabricaBotones.BotonesObjetos;

import Entidad.PowerUp.ObjetosPreciosos.ObjetoPrecioso;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoTronco;

public class BotonTronco extends BotonObjeto {

    public static BotonTronco instance = null;

    public static BotonTronco getBotonTronco(){
        if(instance==null)
            instance = new BotonTronco();

        return instance;
    }

    private BotonTronco(){
        super("Sprites/Objetos/ObjetoTronco/SpriteBoton.png");
    }

    public ObjetoPrecioso getObjeto() {
        return new ObjetoTronco(300);
    }
}
