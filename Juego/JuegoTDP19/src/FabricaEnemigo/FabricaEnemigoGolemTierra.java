package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoGolemTierra;

public class FabricaEnemigoGolemTierra extends FabricaEnemigo {

    private static FabricaEnemigoGolemTierra instance=null;


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
        return new EnemigoGolemTierra(300,30,1750,0,2,100,3);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoGolemTierra(300,30,1750,0,2,100,3);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());

        return enemigo;
    }
}
