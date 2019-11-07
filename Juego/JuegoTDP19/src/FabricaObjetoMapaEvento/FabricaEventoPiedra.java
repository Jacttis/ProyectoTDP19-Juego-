package FabricaObjetoMapaEvento;

import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoPiedra;

public class FabricaEventoPiedra extends FabricaMapaEvento {

    private static FabricaEventoPiedra instance = null;

    public static FabricaEventoPiedra getFabricaEventoPiedra(){
        if(instance==null)
            instance = new FabricaEventoPiedra();

        return instance;
    }

    private FabricaEventoPiedra(){
        super();
    }

    public ObjetoMapa getEvento() {
        return new ObjetoPiedra(getPosicionAleatoria(),250);
    }
}
