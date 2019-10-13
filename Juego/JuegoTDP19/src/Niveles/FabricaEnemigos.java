package Niveles;

import Entidad.*;
import java.awt.Point;

public abstract class FabricaEnemigos {

    protected Enemigo GolemHielo;

    public FabricaEnemigos(){
        GolemHielo=new EnemigoGolemHielo(100,30,1000,1,100,1);
    }

    public abstract Enemigo generarGolemHielo();


}
