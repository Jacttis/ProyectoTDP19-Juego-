package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;

import Entidad.Enemigos.EnemigoFallenAngel;

public class FabricaEnemigoFallenAngel extends FabricaEnemigo {

    public static FabricaEnemigoFallenAngel instance=null;


    public  static FabricaEnemigoFallenAngel getFabricaFallenAngel(){
        if(instance==null){
            instance=new FabricaEnemigoFallenAngel();
        }
        return instance;
    }

    private FabricaEnemigoFallenAngel(){
        super();

    }


    public Enemigo crearEnemigo() {
        return new EnemigoFallenAngel(175,30,1500,0,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        return new EnemigoFallenAngel(175,40,1500,0,2,100,1);
    }
}
