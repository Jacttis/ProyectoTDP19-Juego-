package Niveles;

import Entidad.*;

public class FabricaEnemigosNormales extends FabricaEnemigos {

    public FabricaEnemigosNormales(){

    }


    public Enemigo generarGolemHielo() {

        return (Enemigo) GolemHielo.clone();

    }
}
