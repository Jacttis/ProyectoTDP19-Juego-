package FabricaBotones;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.CaballeroEscudo;

public class BotonCaballeroEscudo extends BotonAliado {

    public BotonCaballeroEscudo(){
        super("Sprites/CharacterSprites/SpriteBoton/CabAchicado2.png");
    }


    public Aliado getAliado() {
        return new CaballeroEscudo(250,12,1250,0,0,"Aguanta Mucho pero no pega");
    }
}
