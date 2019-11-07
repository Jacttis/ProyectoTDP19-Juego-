package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoGolemTierra;
import Entidad.PowerUp.BoostDamage;

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
        return new EnemigoGolemTierra(300,30,1750,0,2,100,2);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoGolemTierra(300,30,1750,0,2,100,2);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());

        return enemigo;
    }
}
