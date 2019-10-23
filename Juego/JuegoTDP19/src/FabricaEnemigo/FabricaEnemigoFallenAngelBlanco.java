package FabricaEnemigo;

import Entidad.Enemigo;
import Entidad.EnemigoFallenAngelBlanco;

public class FabricaEnemigoFallenAngelBlanco extends FabricaEnemigo {

    public static FabricaEnemigoFallenAngelBlanco instance=null;


    public  static FabricaEnemigoFallenAngelBlanco getFabricaFallenAngelBlanco(){
        if(instance==null){
            instance=new FabricaEnemigoFallenAngelBlanco();
        }
        return instance;
    }

    private FabricaEnemigoFallenAngelBlanco(){
        super();

    }


    public Enemigo crearEnemigo() {
        return new EnemigoFallenAngelBlanco(175,30,1500,0,2,100,1);
    }


    public Enemigo crearEnemigoBoosted() {
        return new EnemigoFallenAngelBlanco(175,40,1500,0,2,100,1);
    }
}