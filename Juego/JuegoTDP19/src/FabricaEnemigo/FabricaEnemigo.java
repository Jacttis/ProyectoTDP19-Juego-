package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;

public abstract class FabricaEnemigo {

    public FabricaEnemigo(){

    }

    public abstract Enemigo crearEnemigo();
    public abstract Enemigo crearEnemigoBoosted();


}
