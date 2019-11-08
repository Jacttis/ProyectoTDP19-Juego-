package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.PowerUp.ObjetosPreciosos.AgujeroNegro;
import Entidad.PowerUp.MagiasTemporales.BoostDamage;
import Entidad.PowerUp.MagiasTemporales.CampoProteccion;
import Entidad.PowerUp.ObjetosPreciosos.ObjetoTronco;
import Entidad.PowerUp.PowerUp;

import java.util.Random;

public abstract class FabricaEnemigo {


    protected PowerUp obtenerPowerUpAlAzar(){
        Random r = new Random();
        int aleatorio = r.nextInt(20);

        PowerUp power=null;

        if(aleatorio<5)
            power = new BoostDamage(4000,30);
        else
            if(aleatorio<10)
                power = new CampoProteccion(5000);
            else
                if(aleatorio<15)
                    power = new AgujeroNegro();
                else
                    power = new ObjetoTronco(175);
        return power;
    }

    public abstract Enemigo crearEnemigo();
    public abstract Enemigo crearEnemigoBoosted();


}
