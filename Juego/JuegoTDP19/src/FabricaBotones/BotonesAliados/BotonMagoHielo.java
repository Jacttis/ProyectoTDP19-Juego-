package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.MagoHielo;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonMagoHielo extends BotonAliado {

    public BotonMagoHielo(){
        super("Sprites/CharacterSprites/SpriteBoton/MagoHieloAchicado.png");
    }

    public Aliado getAliado() {
        return new MagoHielo(125,40,2000,1000,0,"Tira bolas de hielo lentas pero poderosas");
    }
}
