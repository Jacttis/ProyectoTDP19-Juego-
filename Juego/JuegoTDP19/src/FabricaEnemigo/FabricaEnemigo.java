package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.AgujeroNegro;
import Entidad.PowerUp.BoostDamage;
import Entidad.PowerUp.CampoProteccion;
import Entidad.PowerUp.PowerUp;

import java.util.Random;

public abstract class FabricaEnemigo {

    public FabricaEnemigo(){

    }

    public PowerUp obtenerPowerUpAlAzar(){
        Random r = new Random();
        int aleatorio = r.nextInt(20);

        PowerUp power=null;

        if(aleatorio<5)
            power = new BoostDamage(4000,30);
        else
            if(aleatorio<10)
                power = new CampoProteccion(5000);
            else
                if(aleatorio<21)
                    power = new AgujeroNegro();

        return power;
    }

    public abstract Enemigo crearEnemigo();
    public abstract Enemigo crearEnemigoBoosted();


}
