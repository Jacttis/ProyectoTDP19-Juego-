package FabricaObjetoMapaEvento;

import Entidad.ObjetosMapa.ObjetoLago;
import Entidad.ObjetosMapa.ObjetoMapa;

public class FabricaEventoLago extends FabricaMapaEvento {

    private static FabricaEventoLago instance = null;

    public static FabricaEventoLago getFabricaEventoLago(){
        if(instance==null)
            instance = new FabricaEventoLago();

        return instance;
    }

    private FabricaEventoLago(){
        super();
    }

    public ObjetoMapa getEvento() {
        return new ObjetoLago(getPosicionAleatoria(),10000,1);
    }
}
