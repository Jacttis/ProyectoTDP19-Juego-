package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.ArqueroHumano;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonArqueroHumano extends BotonAliado {

    public BotonArqueroHumano() {
        super("Sprites/CharacterSprites/SpriteBoton/ArqueroHumano.png");
    }


    public Aliado getAliado() {
        return new ArqueroHumano(100,20,1300,1300,0,"Dispara flechas a un gran rango y con mucha velocidad");
    }
}