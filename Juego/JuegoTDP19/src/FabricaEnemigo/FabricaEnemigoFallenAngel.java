package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;

import Entidad.Enemigos.EnemigoFallenAngel;

public class FabricaEnemigoFallenAngel extends FabricaEnemigo {

    private static FabricaEnemigoFallenAngel instance=null;


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
        return new EnemigoFallenAngel(200,40,1500,0,3,100);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoFallenAngel(200,40,1500,0,3,100);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());

        return enemigo;
    }
}
