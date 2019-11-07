package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.CaballeroEscudo;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonCaballeroEscudo extends BotonAliado {

    public BotonCaballeroEscudo(){
        super("Sprites/CharacterSprites/SpriteBoton/CabAchicado2.png");
    }


    public Aliado getAliado() {
        return new CaballeroEscudo(250,12,1250,0,0,"Aguanta Mucho pero no pega");
    }
}
