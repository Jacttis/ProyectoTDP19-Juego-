package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.ReaperMan;

public class FabricaEnemigoReaperMan extends FabricaEnemigo {

    private static FabricaEnemigoReaperMan instance=null;

    private FabricaEnemigoReaperMan(){
        super();
    }


    public static FabricaEnemigoReaperMan getFabricaReaperMan(){
        if(instance==null){
            instance=new FabricaEnemigoReaperMan();
        }
        return instance;
    }

    public Enemigo crearEnemigo(){return new ReaperMan(75,50,1250,400,3,150);}
    public Enemigo crearEnemigoBoosted(){
        Enemigo enemigo = new ReaperMan(75,50,1250,400,3,150);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());
        return enemigo;
    }

}
