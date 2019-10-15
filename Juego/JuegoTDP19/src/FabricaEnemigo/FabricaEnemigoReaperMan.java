package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.ReaperMan;

public class FabricaEnemigoReaperMan extends FabricaEnemigo {

    protected Enemigo reaperManNormal,reaperManBoosted;
    public static FabricaEnemigoReaperMan instance=null;

    private FabricaEnemigoReaperMan(){
        super();
        reaperManNormal=new ReaperMan(175,50,1500,2,150,2);
        reaperManBoosted=new ReaperMan(175,50,1500,2,150,2);
    }


    public static FabricaEnemigoReaperMan getFabricaReaperMan(){
        if(instance==null){
            instance=new FabricaEnemigoReaperMan();
        }
        return instance;
    }

    public Enemigo crearEnemigo(){return (Enemigo) reaperManNormal.clone();}
    public Enemigo crearEnemigoBoosted(){return (Enemigo) reaperManBoosted.clone();}

}
