package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemHielo;
import Entidad.EnemigoGolemTierra;

public class FabricaEnemigoGolemHielo extends FabricaEnemigo {

    protected Enemigo golemHieloNormal,golemHieloBoosted;
    public static FabricaEnemigoGolemHielo instance=null;

    public  static FabricaEnemigoGolemHielo getFabricaGolemHielo(){
        if(instance==null){
            instance=new FabricaEnemigoGolemHielo();
        }
        return instance;
    }

    private FabricaEnemigoGolemHielo(){
        super();
        golemHieloNormal = new EnemigoGolemHielo(100,15,1000,2,100,1);
        golemHieloBoosted = new EnemigoGolemHielo(100,20,1000,2,100,1);
    }

    public Enemigo crearEnemigo() {
        return (Enemigo) golemHieloNormal.clone();
    }


    public Enemigo crearEnemigoBoosted() {
        return (Enemigo) golemHieloBoosted.clone();
    }
}
