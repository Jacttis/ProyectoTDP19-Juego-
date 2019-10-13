package FabricaEnemigo;

import Entidad.Enemigo;

public abstract class FabricaEnemigo {

    public FabricaEnemigo(){

    }

    public abstract Enemigo crearEnemigo();
    public abstract Enemigo crearEnemigoBoosted();


}
