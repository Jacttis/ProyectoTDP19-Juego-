package Niveles;

import Entidad.*;

public class FabricaEnemigosNormales extends FabricaEnemigos {

    public FabricaEnemigosNormales(){

    }


    public Entidad generarGolemHielo() {

        return GolemHielo.clone();

    }
}
