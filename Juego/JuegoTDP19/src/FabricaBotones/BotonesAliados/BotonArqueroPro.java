package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.ArqueroPRO;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonArqueroPro extends BotonAliado {

    public BotonArqueroPro(){
        super("Sprites/CharacterSprites/SpriteBoton/ArqueroPROchico.png");
    }

    public Aliado getAliado() {
        return new ArqueroPRO(100,15,1250,1300,0,"Dispara flechas");
    }
}
