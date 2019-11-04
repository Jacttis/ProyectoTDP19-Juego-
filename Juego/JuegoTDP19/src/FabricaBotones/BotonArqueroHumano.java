package FabricaBotones;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.ArqueroHumano;

public class BotonArqueroHumano extends BotonAliado {

    public BotonArqueroHumano() {
        super("Sprites/CharacterSprites/SpriteBoton/ArqueroHumano.png");
    }


    public Aliado getAliado() {
        return new ArqueroHumano(100,20,750,1300,0,"Dispara flechas");
    }
}