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
        return new EnemigoGolemTierra(275,30,1500,0,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoGolemTierra(275,40,1500,0,2,100,1);
        enemigo.agregarPowerUp(new BoostDamage(enemigo.getPos(),1,3000,30));

        return enemigo;
    }
}
