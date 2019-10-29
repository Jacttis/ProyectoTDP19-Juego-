package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoFallenAngelBlanco;
import Entidad.PowerUp.BoostDamage;

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
        Enemigo enemigo = new EnemigoFallenAngelBlanco(175,40,1500,0,2,100,1);
        enemigo.agregarPowerUp(new BoostDamage(enemigo.getPos(),1,3000,40));
        return enemigo;
    }
}