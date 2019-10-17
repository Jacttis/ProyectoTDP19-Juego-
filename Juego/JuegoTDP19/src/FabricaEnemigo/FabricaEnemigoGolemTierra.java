package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemTierra;

public class FabricaEnemigoGolemTierra extends FabricaEnemigo {

    public static FabricaEnemigoGolemTierra instance=null;


    public  static FabricaEnemigoGolemTierra getFabricaGolemTierra(){
        if(instance==null){
            instance=new FabricaEnemigoGolemTierra();
        }
        return instance;
    }

    private FabricaEnemigoGolemTierra(){
        super();

    }


    public Enemigo crearEnemigo() {
        return new EnemigoGolemTierra(175,30,1500,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        return new EnemigoGolemTierra(175,40,1500,2,100,1);
    }
}
