package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoFallenAngelBlanco;

public class FabricaEnemigoFallenAngelBlanco extends FabricaEnemigo {

    private static FabricaEnemigoFallenAngelBlanco instance=null;


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
        return new EnemigoFallenAngelBlanco(175,50,1500,0,3,100);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoFallenAngelBlanco(175,50,1500,0,3,100);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());
        return enemigo;
    }
}