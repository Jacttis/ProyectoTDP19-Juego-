package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.CaballeroEscudo;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonCaballeroEscudo extends BotonAliado {

    public BotonCaballeroEscudo(){
        super("Sprites/CharacterSprites/SpriteBoton/CabAchicado2.png");
    }


    public Aliado getAliado() {
        return new CaballeroEscudo(300,15,1000,0,0,"Caballero melee que aguanta mucho pero pega poco");
    }
}
