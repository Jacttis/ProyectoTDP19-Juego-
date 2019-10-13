package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemHielo;
import Juego.Mapa;

public class FabricaEnemigoGolemHielo extends FabricaEnemigo {

    protected Enemigo golemHieloNormal,golemHieloBoosted;

    public FabricaEnemigoGolemHielo(){
        super();
        golemHieloNormal = new EnemigoGolemHielo(100,30,1000,1,100,1);
        golemHieloBoosted = new EnemigoGolemHielo(100,40,1000,1,100,1);
    }

    public Enemigo crearEnemigo() {
        return (Enemigo) golemHieloNormal.clone();
    }


    public Enemigo crearEnemigoBoosted() {
        return (Enemigo) golemHieloBoosted.clone();
    }
}
