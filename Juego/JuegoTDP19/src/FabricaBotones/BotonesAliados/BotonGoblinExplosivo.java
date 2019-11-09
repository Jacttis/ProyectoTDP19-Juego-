package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.GoblinExplosivo;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonGoblinExplosivo extends BotonAliado {

    public BotonGoblinExplosivo(){
        super("src/Sprites/CharacterSprites/SpriteBoton/GoblinExplosivo.png");
    }

    public Aliado getAliado() {
        return new GoblinExplosivo(50,150,0,0,4,"Corre hacia adelante y explota al impactar con un enemigo");
    }
}
