package Entidad.PowerUp;

import Constantes.Constantes;
import Entidad.Aliados.Aliado;

public class ControladorPowerAliado {

    public static ControladorPowerAliado instance = null;

    public static ControladorPowerAliado getControladorPowerAliado(){
        if(instance==null)
            instance=new ControladorPowerAliado();

        return instance;
    }

    private PowerUp nextPower;

    private ControladorPowerAliado(){

    }

    public void setNextPower(PowerUp power){
        nextPower=power;
    }

    public void aplicarPowerToAliado(Aliado aliado){
        if(nextPower!=null) {
            System.out.println("Damage de aliado antes : "+aliado.getDamage());
            nextPower.afectarPersonaje(aliado);
            nextPower=null;
        }
    }


}
