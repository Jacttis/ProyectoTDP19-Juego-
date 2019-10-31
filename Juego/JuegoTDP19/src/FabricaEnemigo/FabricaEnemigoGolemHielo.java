package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoGolemHielo;
import Entidad.PowerUp.BoostDamage;
import Entidad.PowerUp.CampoProteccion;

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
        enemigo.agregarPowerUp(new CampoProteccion(enemigo.getPos(),15000));
        //enemigo.agregarPowerUp(new BoostDamage(enemigo.getPos(),3000,20));
        return enemigo;
    }
}
