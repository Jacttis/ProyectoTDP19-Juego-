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

    public Enemigo crearEnemigo(){return new ReaperMan(75,40,1500,400,2,150,2);}
    public Enemigo crearEnemigoBoosted(){return new ReaperMan(75,40,1500,400,2,150,2);}

}
