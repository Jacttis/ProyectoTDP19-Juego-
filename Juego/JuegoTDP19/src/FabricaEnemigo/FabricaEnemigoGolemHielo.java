package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoGolemHielo;

public class FabricaEnemigoGolemHielo extends FabricaEnemigo {

    private static FabricaEnemigoGolemHielo instance=null;

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
        return new EnemigoGolemHielo(200,20,1000,0,2,100);
    }


    public Enemigo crearEnemigoBoosted() {
        EnemigoGolemHielo enemigo = new EnemigoGolemHielo(200,20,1000,0,2,100);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());
        return enemigo;
    }
}
