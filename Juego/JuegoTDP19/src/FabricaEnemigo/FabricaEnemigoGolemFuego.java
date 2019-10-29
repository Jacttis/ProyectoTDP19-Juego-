package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoGolemFuego;
import Entidad.PowerUp.BoostDamage;


public class FabricaEnemigoGolemFuego extends FabricaEnemigo {

    public static FabricaEnemigoGolemFuego instance=null;


    public  static FabricaEnemigoGolemFuego getFabricaGolemFuego(){
        if(instance==null){
            instance=new FabricaEnemigoGolemFuego();
        }
        return instance;
    }

    private FabricaEnemigoGolemFuego(){
        super();

    }


    public Enemigo crearEnemigo() {
        return new EnemigoGolemFuego(175,30,1500,0,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoGolemFuego(175,40,1500,0,2,100,1);
        enemigo.agregarPowerUp(new BoostDamage(enemigo.getPos(),0,3000,40));
        return enemigo;
    }
}
