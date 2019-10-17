package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemHielo;
import Entidad.EnemigoGolemTierra;

public class FabricaEnemigoGolemHielo extends FabricaEnemigo {

    public static FabricaEnemigoGolemHielo instance=null;

    public  static FabricaEnemigoGolemHielo getFabricaGolemHielo(){
        if(instance==null){
            instance=new FabricaEnemigoGolemHielo();
        }
        return instance;
    }

    private FabricaEnemigoGolemHielo(){
        super();
    }

    public Enemigo crearEnemigo() {
        return new EnemigoGolemHielo(100,15,1000,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        return new EnemigoGolemHielo(100,20,1000,2,100,1);
    }
}
