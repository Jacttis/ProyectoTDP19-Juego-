package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.GoblinExplosivo;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonGoblinExplosivo extends BotonAliado {

    public BotonGoblinExplosivo(){
        super("Sprites/CharacterSprites/SpriteBoton/GoblinExplosivo.png");
    }

    public Aliado getAliado() {
        return new GoblinExplosivo(200,125,10000,0,4,"Explota al impactar con un enemigo");
    }
}
