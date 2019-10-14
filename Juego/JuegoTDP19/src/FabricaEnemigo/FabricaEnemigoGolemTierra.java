package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemTierra;

public class FabricaEnemigoGolemTierra extends FabricaEnemigo {

    protected Enemigo golemTierraNormal,golemTierraBoosted;
    public static FabricaEnemigoGolemTierra instance=null;


    public  static FabricaEnemigoGolemTierra getFabricaGolemTierra(){
        if(instance==null){
            instance=new FabricaEnemigoGolemTierra();
        }
        return instance;
    }

    private FabricaEnemigoGolemTierra(){
        super();
        golemTierraNormal = new EnemigoGolemTierra(175,30,1500,2,100,1);
        golemTierraBoosted = new EnemigoGolemTierra(175,40,1500,2,100,1);

    }


    public Enemigo crearEnemigo() {
        return (Enemigo) golemTierraNormal.clone();
    }


    public Enemigo crearEnemigoBoosted() {
        return (Enemigo) golemTierraBoosted.clone();
    }
}
