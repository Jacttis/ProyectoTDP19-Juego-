package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemHielo;
import Entidad.EnemigoGolemTierra;
import Entidad.PowerUp.BoostDamage;

import java.awt.*;

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
        return new EnemigoGolemHielo(200,15,1000,0,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        EnemigoGolemHielo enemigo = new EnemigoGolemHielo(200,15,1000,0,2,100,1);
        enemigo.agregarPowerUp(new BoostDamage(enemigo.getPos(),1,3000,20));
        return enemigo;
    }
}
