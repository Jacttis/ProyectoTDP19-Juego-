package Niveles;

import Entidad.*;

public class FabricaEnemigosNormales extends FabricaEnemigos {

    public FabricaEnemigosNormales(){

    }


    public Personaje generarGolemHielo() {

        return (Personaje) GolemHielo.clone();

    }
}
