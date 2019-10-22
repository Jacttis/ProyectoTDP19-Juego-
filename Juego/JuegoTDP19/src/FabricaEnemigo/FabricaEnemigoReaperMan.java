package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.ReaperMan;

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

    public Enemigo crearEnemigo(){return new ReaperMan(75,50,1500,400,3,150,2);}
    public Enemigo crearEnemigoBoosted(){return new ReaperMan(75,50,1500,400,3,150,2);}

}
