package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Entidad.Aliados.ArqueroPRO;
import FabricaBotones.BotonesAliados.BotonAliado;

public class BotonArqueroPro extends BotonAliado {

    public BotonArqueroPro(){
        super("Sprites/CharacterSprites/SpriteBoton/ArqueroPROchico.png");
    }

    public Aliado getAliado() {
        return new ArqueroPRO(75,30,1800,1000,0,"Arquero avanzado que dispara flechas que golpean hasta dos enemigos");
    }
}
