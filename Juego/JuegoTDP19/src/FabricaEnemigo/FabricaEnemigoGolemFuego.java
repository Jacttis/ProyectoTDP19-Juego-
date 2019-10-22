package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoGolemFuego;


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
        return new EnemigoGolemFuego(175,40,1500,0,2,100,1);
    }
}
