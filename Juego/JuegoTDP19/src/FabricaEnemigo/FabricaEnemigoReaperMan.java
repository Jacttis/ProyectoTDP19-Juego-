package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.ReaperMan;

public class FabricaEnemigoReaperMan extends FabricaEnemigo {

    public static FabricaEnemigoReaperMan instance=null;

    private FabricaEnemigoReaperMan(){
        super();
    }


    public static FabricaEnemigoReaperMan getFabricaReaperMan(){
        if(instance==null){
            instance=new FabricaEnemigoReaperMan();
        }
        return instance;
    }

    public Enemigo crearEnemigo(){return new ReaperMan(75,50,1250,400,2,150,4);}
    public Enemigo crearEnemigoBoosted(){
        Enemigo enemigo = new ReaperMan(75,50,1250,400,2,150,4);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());
        return enemigo;
    }

}
